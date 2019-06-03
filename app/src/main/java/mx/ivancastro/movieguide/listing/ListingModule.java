package mx.ivancastro.movieguide.listing;

import mx.ivancastro.movieguide.favorites.FavoritesInteractor;
import mx.ivancastro.movieguide.listing.sorting.SortingOptionStore;
import mx.ivancastro.movieguide.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

@Module
public class ListingModule {
    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          TmdbWebService tmdbWebService,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImplementation(favoritesInteractor, tmdbWebService, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImplementation(interactor);
    }
}
