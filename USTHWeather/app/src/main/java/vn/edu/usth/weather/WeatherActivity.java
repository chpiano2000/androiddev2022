package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
//        WeatherFragment firstFragment = new WeatherFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.weather_frag, firstFragment).commit();
//        ForecastFragment secondFragment = new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.forecast_frag,secondFragment).commit();

        PagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
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