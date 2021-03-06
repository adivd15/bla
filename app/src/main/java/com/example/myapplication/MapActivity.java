package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.karumi.dexter.Dexter;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    //private ActivityMapsBinding binding;

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button buttonOpenPopup;

    private EditText popup_centername, popup_centeraddress, popup_centertype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        configureButton();

        Button btnGrant = findViewById(R.id.btnGrant);
        btnGrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button btnAddCenter = findViewById(R.id.btnAddCenter);
        btnAddCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MapActivity.this, Pop.class));

            }
        });
    }

    private void configureButton() {
        ImageButton buttonReview = findViewById(R.id.button_mainActivity);
        ImageButton buttonQrScanner = findViewById(R.id.button_QrScannerActivity);

        buttonReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, MainActivity.class));
            }
        });

        buttonQrScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, QrScannerActivity.class));
            }
        });
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}