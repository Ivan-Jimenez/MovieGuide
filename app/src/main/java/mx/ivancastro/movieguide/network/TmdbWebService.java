package mx.ivancastro.movieguide.network;

import mx.ivancastro.movieguide.MoviesWrapper;
import mx.ivancastro.movieguide.ReviewsWrapper;
import mx.ivancastro.movieguide.VideoWrapper;

import retrofit2.http.GET;
import retrofit2.http.Path;
import io.reactivex.Observable;
import retrofit2.http.Query;

public interface TmdbWebService {

    @GET("3/discover/movie?language=es&sort_by=popularity.desc")
    Observable<MoviesWrapper> popularMovies(@Query("page") int page);

    @GET("3/discover/movie?vote_count.gte=500&language=es&sort_by=vote_average.desc")
    Observable<MoviesWrapper> highestRatedMovies(@Query("page") int page);

    @GET("3/discover/movie?language=es&sort_by=release_date.desc")
    Observable<MoviesWrapper> newestMovies(@Query("release_date.lte") String maxReleaseDate, @Query("vote_count.gte") int minVoteCount);

    @GET("3/movie/{movieId}/videos")
    Observable<VideoWrapper> trailers(@Path("movieId") String movieId);

    @GET("3/movie/{movieId}/reviews")
    Observable<ReviewsWrapper> reviews(@Path("movieId") String movieId);

    @GET("3/search/movie?language=es-MX&page=1")
    Observable<MoviesWrapper> searchMovies(@Query("query") String searchQuery);

}
