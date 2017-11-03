package cuc.salascuc;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        LatLng Bloque11 = new LatLng(10.9951823,-74.7890932);
        LatLng Bloque8 = new LatLng(10.995173,-74.790781);
        LatLng Bloque2 = new LatLng(10.994962,-74.790966);
        LatLng center = new LatLng(10.994987,-74.789938);
        mMap.addMarker(new MarkerOptions().position(Bloque11).title("Bloque 11 piso 2"));
        mMap.addMarker(new MarkerOptions().position(Bloque8).title("Bloque 8 piso 3"));
        mMap.addMarker(new MarkerOptions().position(Bloque2).title("Bloque 2 piso 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center,18));

    }
}
