package mx.ivancastro.movieguide.listing.sorting;

class SortingDialogInteractorImplementation implements SortingDialogInteractor {
    private SortingOptionStore sortingOptionStore;

    SortingDialogInteractorImplementation(SortingOptionStore store)
    {
        sortingOptionStore = store;
    }

    @Override
    public int getSelectedSortingOption()
    {
        return sortingOptionStore.getSelectedOption();
    }

    @Override
    public void setSortingOption(SortType sortType) {
        sortingOptionStore.setSelectedOption(sortType);
    }
}
