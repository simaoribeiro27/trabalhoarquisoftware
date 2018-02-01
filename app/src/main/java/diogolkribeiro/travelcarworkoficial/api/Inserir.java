package diogolkribeiro.travelcarworkoficial.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by diogomanuel on 19/01/2018.
 */

public interface Inserir {

    final static String URL_POST = "https://monkeystudios.herokuapp.com/";

    @FormUrlEncoded
    @POST("reservations")
    Call<ResponseBody> enviarReserva(@Field("idTravel") String idTravel,
                                     @Field("phone") String phone,
                                     @Field("places") String places,
                                     @Field("name") String name,
                                     @Field("email") String email,
                                     @Field("startingData") String startingData);

    final  static Retrofit retrofitPost = new Retrofit.Builder()
            .baseUrl(URL_POST)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
