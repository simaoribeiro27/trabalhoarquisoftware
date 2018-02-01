package diogolkribeiro.travelcarworkoficial.api;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesEntrada;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by diogomanuel on 11/01/2018.
 */

public interface RecebeViagens {

    final static String URL_GET = "https://monkeystudios.herokuapp.com/";


    @GET("travels")
    Call<List<DetalhesEntrada>> getViagens();



    final  static Retrofit retrofitPost = new Retrofit.Builder()
            .baseUrl(URL_GET)
            .addConverterFactory(GsonConverterFactory.create())
            .build();



}
