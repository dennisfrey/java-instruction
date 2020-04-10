package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB implements DAO<Movie> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);

		return conn;
	}

	@Override
	public Movie get(int id) {
		String sql = "SELECT ID, Title, Year, Rating, Director " + "FROM Movie " + "WHERE ID = ?";
		Movie m = null;
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int uId = rs.getInt(1);
				String t = rs.getString(2);
				int y = rs.getInt(3);
				String r = rs.getString(4);
				String d = rs.getString(5);
				m = new Movie(uId, t, y, r, d);
								
			} else {
				rs.close();
				m = null;
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return m;
	}

	@Override
	public List<Movie> list() {
		String sql = "SELECT * from movie";
		List<Movie> movies = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			// while there is a row in the rs
			while (rs.next()) {
				int id = rs.getInt(1);
				String t = rs.getString(2);
				int y = rs.getInt(3);
				String r = rs.getString(4);
				String d = rs.getString(5);

				Movie m = new Movie(id, t, y, r, d); // create movie object
				movies.add(m); // add object to the list

			}

		} catch (SQLException e) {
			e.printStackTrace();
			movies = null;
		}

		return movies;
	}

	@Override
	public boolean add(Movie m) {
		boolean success = false;
		String sql = "INSERT into Movie (Title, Year, Rating, Director) "
					+ " values (?,?,?,?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
			success = true; // if the update fails it will end up in the catch exception

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return success;
	}
	

	@Override
	public boolean update(Movie m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Movie m) {
		String sql = "DELETE FROM Movie " + "WHERE ID = ?";
		boolean success = false;

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			int id = m.getId();
			ps.setInt(1, id);
			ps.executeUpdate();
			success = true;
			
		} catch (SQLException e) {

			e.printStackTrace();
			success = false;
		}
		return success;
	}

}
