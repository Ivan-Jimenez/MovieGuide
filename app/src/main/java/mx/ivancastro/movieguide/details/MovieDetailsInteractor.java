package mx.ivancastro.movieguide.details;

import mx.ivancastro.movieguide.Review;
import mx.ivancastro.movieguide.Video;

import java.util.List;

import io.reactivex.Observable;

public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
