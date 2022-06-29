package com.swe.mvvmpractice.network;

import com.swe.mvvmpractice.responses.TVShowDetailsResponse;
import com.swe.mvvmpractice.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("most-popular")
    Call<TVShowsResponse> getMostPopularTVShows(@Query("page")int page);

    @GET("show-details")
    Call<TVShowDetailsResponse> getTVShowDetails(@Query("q")String tvShowId);

    @GET("show-details")
    Call<TVShowsResponse> searchTVShow(@Query("q") String query, @Query("page") int page);
}
