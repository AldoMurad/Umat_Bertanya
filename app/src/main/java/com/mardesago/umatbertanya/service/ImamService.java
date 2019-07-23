package com.mardesago.umatbertanya.service;

import com.mardesago.umatbertanya.model.artikel;
import com.mardesago.umatbertanya.model.biografi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Febrian Reza on 21-Nov-17.
 */

public interface ImamService {
    @GET( "imam" )
    Call<List<biografi>> getImam();
}
