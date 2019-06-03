package mx.ivancastro.movieguide;

import mx.ivancastro.movieguide.details.DetailsComponent;
import mx.ivancastro.movieguide.details.DetailsModule;
import mx.ivancastro.movieguide.favorites.FavoritesModule;
import mx.ivancastro.movieguide.listing.ListingComponent;
import mx.ivancastro.movieguide.listing.ListingModule;
import mx.ivancastro.movieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent
{
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
