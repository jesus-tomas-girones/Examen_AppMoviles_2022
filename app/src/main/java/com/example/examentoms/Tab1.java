package com.example.examentoms;

import static android.content.Context.LOCATION_SERVICE;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Tab1 extends Fragment implements LocationListener {

    // 8.- Geolocalización CUIDADO: Para que funcione hay que dar permiso manualmente en el dispositivo
    LocationManager manejador;
    TextView latitud, longitud;
    Button button1, button3;
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        // 3.- Propiedades vistas
        button1 = view.findViewById(R.id.button1);
        editText = view.findViewById(R.id.editText);
        latitud = view.findViewById(R.id.latitud);
        longitud = view.findViewById(R.id.longitud);
        button3 = view.findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double raiz = Math.sqrt(Double.parseDouble(editText.getText().toString()));
                    button1.setText("" + raiz);
                } catch (Exception e) {
                    button1.setText("ERROR");
                }
            }
        });
        // 8.- Geolocalización
        manejador = (LocationManager) getActivity().getSystemService(LOCATION_SERVICE);
        // 9.- Receptror anuncio
        IntentFilter filtro = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
        filtro.addCategory(Intent.CATEGORY_DEFAULT);
        getActivity().registerReceiver(new ReceptorAnuncios(), filtro);
        return view;
    }

    // 9.- Receptror anuncio
    public class ReceptorAnuncios extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            button3.setBackgroundColor(Color.RED);
        }
    }

    // 8.- Geolocalización
    @SuppressLint("MissingPermission")
    @Override public void onResume() {
        super.onResume();
        manejador.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1, 1,this);
    }

    @Override public void onPause() {
        super.onPause();
        manejador.removeUpdates(this);
        Log.e("Examen", "Se dejan de recibir actualizaciones de posición");
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        latitud.setText("" + location.getLatitude());
        longitud.setText("" + location.getLongitude());
    }

}
