package com.example.busbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class LocationpageActivity extends AppCompatActivity
{

    TextView textViewLatt, textViewLong, textViewAdd, textViewLoc, textViewCountry;
    Button button;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationpage);
        textViewLatt = findViewById(R.id.TVlatt);
        textViewLong = findViewById(R.id.TVlong);
        textViewAdd = findViewById(R.id.Tvadd);
        textViewLoc = findViewById(R.id.TVloc);
        textViewCountry = findViewById(R.id.TVcountry);
        button = findViewById(R.id.btn);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (ActivityCompat.checkSelfPermission(LocationpageActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)
                    showLocation();
                else
                    ActivityCompat.requestPermissions(LocationpageActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);

            }
        });
    }

    private void showLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>()
        {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location = task.getResult();
                if (location != null) {
                    Geocoder geocoder = new Geocoder(LocationpageActivity.this, Locale.getDefault());
                    try {
                        List<Address> addressList = geocoder.getFromLocation(location.getLatitude(),
                                location.getLongitude(), 1);
                        textViewLatt.setText("Lattitude" + addressList.get(0).getLatitude());
                        textViewLong.setText("longitude" + addressList.get(0).getLongitude());
                        textViewAdd.setText(addressList.get(0).getAddressLine(0));
                        textViewLoc.setText(addressList.get(0).getLocality());
                        textViewCountry.setText(addressList.get(0).getCountryName());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(LocationpageActivity.this, "Location null error", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}