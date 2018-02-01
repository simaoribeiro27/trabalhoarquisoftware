package diogolkribeiro.travelcarworkoficial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.R;

import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesReserva;

/**
 * Created by diogomanuel on 12/01/2018.
 */

public class ReservaAdapter extends BaseAdapter {


    List<DetalhesReserva> datasource;
    Context context;

    public ReservaAdapter(Context ctx,  List<DetalhesReserva> ds) {
        this.context = ctx;
        this.datasource = ds;
    }

    @Override
    public int getCount() {
        return datasource.size();
    }

    @Override
    public Object getItem(int i) {
        return datasource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView tv_name, tv_phone;




        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.reservas_layout_lista,null);
        }

        tv_name = (TextView) view.findViewById(R.id.tv_name);
        tv_phone = (TextView) view.findViewById(R.id.tv_phone);





        DetalhesReserva p = datasource.get(i);
        tv_name.setText(p.getName());
        tv_phone.setText(p.getPhone() + "");


        return view;


    }


}

