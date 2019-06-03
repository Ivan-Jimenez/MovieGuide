package mx.ivancastro.movieguide.listing;

import mx.ivancastro.movieguide.Movie;

import java.util.List;

import io.reactivex.Observable;

public interface MoviesListingInteractor {
    boolean isPaginationSupported();
    Observable<List<Movie>> fetchMovies(int page);
    Observable<List<Movie>> searchMovie(String searchQuery);
}
