package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Stock;

public class StockDB implements DAO<Stock> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/financedb";
		String username = "finance_user";
		String password = "money";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);

		return conn;
	}
	
	@Override
	public Stock get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> list() {
		String sql = "SELECT * from stock";
		List<Stock> stocks = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			// while there is a row in the rs
			while (rs.next()) {
				int id = rs.getInt(1);
				String symbol = rs.getString(2);
				String name = rs.getString(3);
				double price = rs.getDouble(4);
				Stock s = new Stock(id, symbol, name, price);
				stocks.add(s); // add object to the list

			}

		} catch (SQLException e) {
			e.printStackTrace();
			stocks = null;
		}

		return stocks;
	}

	@Override
	public boolean add(Stock t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Stock t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Stock t) {
		// TODO Auto-generated method stub
		return false;
	}

}
