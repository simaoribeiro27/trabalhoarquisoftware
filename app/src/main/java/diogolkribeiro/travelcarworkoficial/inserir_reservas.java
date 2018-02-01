package diogolkribeiro.travelcarworkoficial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import diogolkribeiro.travelcarworkoficial.api.Inserir;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class inserir_reservas extends AppCompatActivity {

    Button in_inserir;
    TextView in_name;
    TextView in_email;
    TextView in_phone;
    TextView in_places;
    TextView in_startingData;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_reservas);


        in_name = (EditText) findViewById(R.id.in_name);
        in_email = (EditText) findViewById(R.id.in_email);
        in_phone = (EditText) findViewById(R.id.in_phone);
        in_places = (EditText) findViewById(R.id.in_places);
        in_startingData = (EditText) findViewById(R.id.in_data);
        in_inserir = (Button) findViewById(R.id.in_inserir);


        ///////////////////
        Intent intent = this.getIntent();
        id = intent.getStringExtra("_id");
        ////////////////

        in_inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent moveTo = new Intent(inserir_reservas.this, Reservas.class);
                startActivity(moveTo);


                Inserir api = Inserir.retrofitPost.create(Inserir.class);

                Call<ResponseBody> post = api.enviarReserva(id,in_phone.getText().toString().trim(),
                        in_places.getText().toString().trim(),in_name.getText().toString().trim(),
                        in_email.getText().toString().trim(),in_startingData.getText().toString().trim());


                post.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        //tv_mensagem
                        //in_inserir.setText(response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
            }
        });


    }
}
