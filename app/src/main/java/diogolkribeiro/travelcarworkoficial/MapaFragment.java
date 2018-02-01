package diogolkribeiro.travelcarworkoficial;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by diogomanuel on 11/01/2018.
 */

public class MapaFragment extends Fragment {

    View myView;
    Button tv_button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.mapa_layout,container,false);


        tv_button = (Button) myView.findViewById(R.id.tv_button);
        //--! Registar --!
        tv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveTo = new Intent(getActivity(), MapsActivity.class);

                startActivity(moveTo);
            }
        });
        return myView;
    }
}


