package com.learn.meuxtudo.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.learn.meuxtudo.R;
import com.learn.meuxtudo.model.Lanche;
import com.learn.meuxtudo.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    RetrofitConfig rfConfig;
    Call<Lanche[]> request;
    TextView tvLanches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLanches = findViewById(R.id.tv_lanches);

        rfConfig = new RetrofitConfig();

        request = rfConfig.getLancheService().getAll();

        request.enqueue(new Callback<Lanche[]>() {
            @Override
            public void onResponse(Call<Lanche[]> call, Response<Lanche[]> response) {
                Lanche[] lanches = response.body();
                Log.d(TAG,lanches.toString());
                Toast.makeText(getApplicationContext(), "Showpeta", Toast.LENGTH_LONG).show();
                String lanchesString = "";
                for (Lanche lanche : lanches) {
                    lanchesString += lanche.getName() + "\n";
                }
                tvLanches.setText(lanchesString);
            }

            @Override
            public void onFailure(Call<Lanche[]> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error: " + t.getMessage(),
                        Toast.LENGTH_LONG).show();
                Log.e(TAG,t.getMessage());
            }
        });
    }
}
