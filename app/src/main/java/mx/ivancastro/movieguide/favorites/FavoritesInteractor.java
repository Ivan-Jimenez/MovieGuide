package mx.ivancastro.movieguide.favorites;

import mx.ivancastro.movieguide.Movie;

import java.util.List;

public interface FavoritesInteractor {
    void setFavorite(Movie movie);
    boolean isFavorite(String id);
    List<Movie> getFavorites();
    void unFavorite(String id);
}
