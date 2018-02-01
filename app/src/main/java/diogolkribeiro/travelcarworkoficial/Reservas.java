package diogolkribeiro.travelcarworkoficial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.adapter.ReservaAdapter;
import diogolkribeiro.travelcarworkoficial.api.RecebeReservas;
import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesReserva;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static diogolkribeiro.travelcarworkoficial.api.RecebeReservas.retrofitPostReservas;

public class Reservas extends AppCompatActivity {


    ListView tv_lista_reservas;
    List<DetalhesReserva> resp;
    ReservaAdapter adapter;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);



        tv_lista_reservas = (ListView) findViewById(R.id.tv_lista_reservas);

        /////////////////////////////////
        Intent intent = this.getIntent();
        id = intent.getStringExtra("_id");
        //////////////////////////////////


        RecebeReservas carro = retrofitPostReservas.create(RecebeReservas.class);

        Call<List<DetalhesReserva>> call = carro.getReserva(id);


        call.enqueue(new Callback< List<DetalhesReserva>>() {
            @Override
            public void onResponse(Call<List<DetalhesReserva>> call, Response<List<DetalhesReserva>> response) {
                if(response.code() == 200){
                    resp = response.body();
                    adapter = new ReservaAdapter(Reservas.this, resp);
                    tv_lista_reservas.setAdapter(adapter);



                }

            }
            @Override
            public void onFailure(Call< List<DetalhesReserva>> call, Throwable t) {
                t.printStackTrace();
            }

        });





    }

}

