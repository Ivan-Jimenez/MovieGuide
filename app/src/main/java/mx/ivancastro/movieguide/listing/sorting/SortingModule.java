package mx.ivancastro.movieguide.listing.sorting;

import dagger.Module;
import dagger.Provides;

@Module
public class SortingModule {
    @Provides
    SortingDialogInteractor providesSortingDialogInteractor(SortingOptionStore store) {
        return new SortingDialogInteractorImplementation(store);
    }

    @Provides
    SortingDialogPresenter providePresenter(SortingDialogInteractor interactor) {
        return new SortingDialogPresenterImplementation(interactor);
    }
}
