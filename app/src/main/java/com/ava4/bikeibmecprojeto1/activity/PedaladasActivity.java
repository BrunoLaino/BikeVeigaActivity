package com.ava4.bikeibmecprojeto1.activity;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ava4.bikeibmecprojeto1.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ava4.bikeibmecprojeto1.databinding.ActivityPedaladasBinding;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PedaladasActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityPedaladasBinding binding;
    private boolean isRunning;
    private TextView textDistancia;
    private TextView textDuracao;
    private TextView textCalorias;
    private TextView textVelMed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPedaladasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        textDistancia = findViewById(R.id.textDistancia);
        textDuracao = findViewById(R.id.textDuracao);
        textCalorias = findViewById(R.id.textCalorias);
        textVelMed = findViewById(R.id.textVelMed);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng veiga = new LatLng(-22.9121332,-43.2217633);
        mMap.addMarker(new MarkerOptions().position(veiga).title("Universidade Veiga de Almeida").icon(BitmapDescriptorFactory.fromResource(R.drawable.bike1)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(veiga, 15));
    }

    public void iniciar(View view) throws InterruptedException {
        Random random = new Random();
        DecimalFormat formato = new DecimalFormat("#.##");

        int distancia = random.nextInt(10000);
        double duracao = random.nextDouble() * 60;
        int calorias = random.nextInt(1000);
        double velMed = random.nextDouble() * 30;

        textDuracao.setText("Duração: " + formato.format(duracao) + " minutos");
        textDistancia.setText("Distancia: " + distancia + "m");
        textCalorias.setText("Calorias: " + calorias + " cal");
        textVelMed.setText("Velocidade media: " + formato.format(velMed)  + " km");
    }

    public void parar(View view) throws InterruptedException {
        textDuracao.setText("Duração:");
        textDistancia.setText("Distancia:");
        textCalorias.setText("Calorias:");
        textVelMed.setText("Velocidade media:");
    }
}