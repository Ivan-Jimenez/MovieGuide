package mx.ivancastro.movieguide.favorites;

import mx.ivancastro.movieguide.Movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FavoritesInteractorImplementation implements FavoritesInteractor
{
    private FavoritesStore favoritesStore;

    FavoritesInteractorImplementation(FavoritesStore store)
    {
        favoritesStore = store;
    }

    @Override
    public void setFavorite(Movie movie)
    {
        favoritesStore.setFavorite(movie);
    }

    @Override
    public boolean isFavorite(String id)
    {
        return favoritesStore.isFavorite(id);
    }

    @Override
    public List<Movie> getFavorites()
    {
        return favoritesStore.getFavorites();
    }

    @Override
    public void unFavorite(String id)
    {
        favoritesStore.unfavorite(id);
    }
}
