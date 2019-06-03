package mx.ivancastro.movieguide.details;

import mx.ivancastro.movieguide.favorites.FavoritesInteractor;
import mx.ivancastro.movieguide.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailsModule {
    @Provides
    @DetailsScope
    MovieDetailsInteractor provideInteractor(TmdbWebService tmdbWebService) {
        return new MovieDetailsInteractorImplementation(tmdbWebService);
    }

    @Provides
    @DetailsScope
    MovieDetailsPresenter providePresenter(MovieDetailsInteractor detailsInteractor,
                                           FavoritesInteractor favoritesInteractor) {
        return new MovieDetailsPresenterImplementation(detailsInteractor, favoritesInteractor);
    }
}
