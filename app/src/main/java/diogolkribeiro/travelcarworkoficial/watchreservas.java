package diogolkribeiro.travelcarworkoficial;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.adapter.ReservaAdapterUnic;
import diogolkribeiro.travelcarworkoficial.api.RecebeReservas;
import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesReserva;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static diogolkribeiro.travelcarworkoficial.api.RecebeReservas.retrofitPostReservas;

/**
 * Created by diogomanuel on 18/01/2018.
 */

public class watchreservas extends Fragment {


    View myView;
    ListView tv_lista_r;
    List<DetalhesReserva> resp;
    ReservaAdapterUnic adapter;
    Activity context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.watchreserva,container,false);
        context =getActivity();
        tv_lista_r = (ListView) myView.findViewById(R.id.tv_lista_r);


        RecebeReservas apii = retrofitPostReservas.create(RecebeReservas.class);

        Call<List<DetalhesReserva>> call = apii.getReservas();

        call.enqueue(new Callback<List<DetalhesReserva>>() {
            @Override
            public void onResponse(Call<List<DetalhesReserva>> call, Response<List<DetalhesReserva>> response) {
                resp = response.body();
                adapter = new ReservaAdapterUnic(context,resp);
                tv_lista_r.setAdapter(adapter);


                tv_lista_r.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {


                    }
                });





            }

            @Override
            public void onFailure(Call<List<DetalhesReserva>> call, Throwable t) {
                t.printStackTrace();
            }

        });




        return myView;
    }
}
