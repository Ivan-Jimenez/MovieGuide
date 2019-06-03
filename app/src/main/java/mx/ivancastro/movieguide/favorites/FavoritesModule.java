package mx.ivancastro.movieguide.favorites;

import mx.ivancastro.movieguide.AppModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
public class FavoritesModule {
    @Provides
    @Singleton
    FavoritesInteractor provideFavouritesInteractor(FavoritesStore store) {
        return new FavoritesInteractorImplementation(store);
    }
}
