package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	private List<Movie> movieList;

	public MovieCollection(List<Movie> movieList) {
		super();
		this.movieList = movieList;
	}

	public MovieCollection() {
		super();
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	@Override
	public String toString() {
		return "MovieCollection [movieList=" + movieList + "]";
	}
	
	public void add() {
		
	}
	
	public List<Movie> filterMovies(Predicate<Movie> condition){
		List<Movie> movies = new ArrayList<>();
		
		return movies;
	}
	
	public double getLowestRating() {
		double lowestRating = 0.0;
		
		return lowestRating;
	}
	
	public double getHighestRating() {
		double highestRating = 0.0;
		
		return highestRating;
	}
	
	public double getAverageRating() {
		double avg = 0.0;
		
		return avg;
	}
	
	public void int 
}
