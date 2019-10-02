package com.dotplays.demoflickr;

import com.dotplays.demoflickr.model.FPhoto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface FlickrService {

    @GET("services/rest/")
    Call<FPhoto> getListFavo(@Query("extras") String extras,
                             @Query("nojsoncallback") String nojsoncallback,
                             @Query("user_id") String user_id,
                             @Query("format") String format,
                             @Query("api_key") String api_key,
                             @Query("method") String method,
                             @Query("page") int page,
                             @Query("per_page") int per_page);


}
