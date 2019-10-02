package com.dotplays.demoflickr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dotplays.demoflickr.model.FPhoto;

import java.io.IOException;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<FPhoto>{

    private static final String FULL_EXTRAS = "views,media,path_alias,url_sq,url_t,url_s,url_q,url_m,url_n,url_z,url_c,url_l,url_o";
    private static final String USER_ID = "Your User ID";
    private static final String KEY_TOKEN = "Your Token";
    private static final String GET_FAVO = "flickr.favorites.getList";
    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyRetrofitBuilder.getInstance().getListFavo(FULL_EXTRAS,
                "1", USER_ID, "json", KEY_TOKEN, GET_FAVO, page,
                15).enqueue(this);
    }

    @Override
    public void onResponse(Call<FPhoto> call, Response<FPhoto> response) {
        
    }

    @Override
    public void onFailure(Call<FPhoto> call, Throwable t) {

    }
}
