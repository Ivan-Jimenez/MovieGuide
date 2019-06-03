package mx.ivancastro.movieguide.listing;

import mx.ivancastro.movieguide.listing.sorting.SortingDialogFragment;
import mx.ivancastro.movieguide.listing.sorting.SortingModule;

import dagger.Subcomponent;

@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
