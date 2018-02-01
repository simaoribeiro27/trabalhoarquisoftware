package diogolkribeiro.travelcarworkoficial;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.adapter.ViagemAdapter;
import diogolkribeiro.travelcarworkoficial.api.RecebeViagens;
import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesEntrada;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static diogolkribeiro.travelcarworkoficial.api.RecebeViagens.retrofitPost;

/**
 * Created by diogomanuel on 11/01/2018.
 */

public class ViagemFragment extends Fragment {

    View myView;
    ListView tv_lista;
    List<DetalhesEntrada> resp;
    ViagemAdapter adapter;
    Activity context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.viagem_layout,container,false);
        context =getActivity();
        tv_lista = (ListView) myView.findViewById(R.id.tv_lista);
        RecebeViagens api = retrofitPost.create(RecebeViagens.class);

        Call<List<DetalhesEntrada>> call = api.getViagens();

        call.enqueue(new Callback<List<DetalhesEntrada>>() {
            @Override
            public void onResponse(Call<List<DetalhesEntrada>> call, Response<List<DetalhesEntrada>> response) {
                resp = response.body();
                adapter = new ViagemAdapter(context,resp);
                tv_lista.setAdapter(adapter);


                tv_lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {

                        Intent intent = new Intent(getActivity(), inserir_reservas.class);
                        intent.putExtra("_id",((ViagemAdapter)arg0.getAdapter()).getViagemId(arg2));

                        startActivity(intent);
                    }
                });





            }

            @Override
            public void onFailure(Call<List<DetalhesEntrada>> call, Throwable t) {
                t.printStackTrace();
            }

        });




        return myView;
    }
}
