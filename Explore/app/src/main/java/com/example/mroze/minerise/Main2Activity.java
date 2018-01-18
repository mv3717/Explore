package com.example.mroze.minerise;

import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public class Main2Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
        BitmapDescriptor bitmapDescriptor
                = BitmapDescriptorFactory.defaultMarker(
                BitmapDescriptorFactory.HUE_MAGENTA);
        BitmapDescriptor bitmapDescriptorNew
                = BitmapDescriptorFactory.defaultMarker( BitmapDescriptorFactory.HUE_GREEN);
        // Add a marker in Sydney and move the camera

        LatLng erosred  = new LatLng(50.9434242, -91.8775253);
        mMap.addMarker(new MarkerOptions().position(erosred).icon(bitmapDescriptor).title("ErosRed Mine -- Barrick "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(erosred));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(erosred , 6.0f) );


        LatLng spruceLake  = new LatLng(52.9434242, -93.8775253);
        mMap.addMarker(new MarkerOptions().position(spruceLake).icon(bitmapDescriptor).title("Spruce Lake Mine -- Barrick"));

        LatLng spruceLake2  = new LatLng(51.9434242, -90.8775253);
        mMap.addMarker(new MarkerOptions().position(spruceLake2).icon(bitmapDescriptorNew).title("Near Spruce Lake site -- 12 reports"));

        LatLng spruceLake3  = new LatLng(50.3434242, -92.1775253);
        mMap.addMarker(new MarkerOptions().position(spruceLake3).icon(bitmapDescriptorNew).title("Near Spruce Lake site -- 9 reports"));

        LatLng unnamed  = new LatLng(51.0841713, -94.1371841);
        mMap.addMarker(new MarkerOptions().position(unnamed).icon(bitmapDescriptorNew).title("New site! -- 1  report"));

    }
}