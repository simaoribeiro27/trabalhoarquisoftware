package diogolkribeiro.travelcarworkoficial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import diogolkribeiro.travelcarworkoficial.R;
import diogolkribeiro.travelcarworkoficial.webmodules.DetalhesEntrada;

/**
 * Created by diogomanuel on 11/01/2018.
 */


public class ViagemAdapter extends BaseAdapter {

    List<DetalhesEntrada> datasource;
    Context context;

    public ViagemAdapter(Context ctx,  List<DetalhesEntrada> ds) {
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



    public String getViagemId( int i) {
        return datasource.get(i).get_id();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView tv_starting, tv_arrival, tv_startingData, tv_lat, tv_long, tv_placesAvailable,tv_busyPlaces, tv_price;




        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.viagem_layout_lista,null);
        }

        tv_starting = (TextView) view.findViewById(R.id.tv_starting);
        tv_arrival = (TextView) view.findViewById(R.id.tv_arrival);
        tv_lat = (TextView) view.findViewById(R.id.tv_Latitude);
        tv_long = (TextView) view.findViewById(R.id.tv_Longitude);
        tv_busyPlaces = (TextView) view.findViewById(R.id.tv_busyPlaces);
        tv_price = (TextView) view.findViewById(R.id.tv_price);
        tv_placesAvailable = (TextView) view.findViewById(R.id.tv_placesAvailable);
        tv_startingData = (TextView) view.findViewById(R.id.tv_startingData);



        DetalhesEntrada p = datasource.get(i);
        tv_arrival.setText(p.getArrival());
        tv_starting.setText(p.getStarting() + "");
        tv_lat.setText(p.getLat() + "");
        tv_long.setText(p.getLonguitude() + "");
        tv_busyPlaces.setText(p.getBusyPlaces() + "");
        tv_price.setText(p.getPrice() + "");
        tv_startingData.setText(p.getStartingData() + "");
        tv_placesAvailable.setText(p.getPlacesAvailable() + "");



        return view;


    }


}

