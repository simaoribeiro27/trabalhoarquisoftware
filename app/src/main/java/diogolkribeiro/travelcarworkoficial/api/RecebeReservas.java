package diogolkribeiro.travelcarworkoficial.api;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesEntrada;
import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesReserva;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by diogomanuel on 12/01/2018.
 */

public interface RecebeReservas {

    final static String URL_GET = "https://monkeystudios.herokuapp.com/";


    @GET("reservationsT/{idTravel}/reservations")
    Call<List<DetalhesReserva>> getReserva(@Path("idTravel") String idTravel);

    @GET("reservations")
    Call<List<DetalhesReserva>> getReservas();




    final  static Retrofit retrofitPostReservas = new Retrofit.Builder()
            .baseUrl(URL_GET)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


}
