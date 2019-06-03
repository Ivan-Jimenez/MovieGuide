package mx.ivancastro.movieguide.details;

import java.util.List;

import mx.ivancastro.movieguide.Movie;
import mx.ivancastro.movieguide.Review;
import mx.ivancastro.movieguide.Video;

interface MovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}
