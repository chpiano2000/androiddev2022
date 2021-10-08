package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        WeatherFragment firstFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.weather_frag, firstFragment).commit();
        ForecastFragment secondFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.forecast_frag,secondFragment).commit();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Weather", "In onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Weather", "In onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Weather", "In onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Weather", "In onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Weather", "In onDestroy");
    }
}