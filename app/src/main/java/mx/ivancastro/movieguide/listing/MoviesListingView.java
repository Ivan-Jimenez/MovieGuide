package mx.ivancastro.movieguide.listing;

import java.util.List;

import mx.ivancastro.movieguide.Movie;

interface MoviesListingView {
    void showMovies(List<Movie> movies);
    void loadingStarted();
    void loadingFailed(String errorMessage);
    void onMovieClicked(Movie movie);
}
