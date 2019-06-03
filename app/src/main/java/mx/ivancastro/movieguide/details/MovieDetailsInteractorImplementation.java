package mx.ivancastro.movieguide.details;

import java.util.List;

import io.reactivex.Observable;
import mx.ivancastro.movieguide.Review;
import mx.ivancastro.movieguide.ReviewsWrapper;
import mx.ivancastro.movieguide.Video;
import mx.ivancastro.movieguide.VideoWrapper;
import mx.ivancastro.movieguide.network.TmdbWebService;

class MovieDetailsInteractorImplementation implements MovieDetailsInteractor {
    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImplementation(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }
}
