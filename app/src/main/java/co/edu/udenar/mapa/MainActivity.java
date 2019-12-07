package co.edu.udenar.mapa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Configuration.getInstance().setUserAgentValue(getPackageName());

        GeoPoint madrid = new GeoPoint(1.234167, -77.285278);

        MapView myOpenMapView = (MapView) findViewById(R.id.mapview);
        myOpenMapView.setBuiltInZoomControls(true);
        MapController myMapController = (MapController) myOpenMapView.getController();
        myMapController.setCenter(madrid);
        myMapController.setZoom(20);

        myOpenMapView.setMultiTouchControls(true);
    }
}
