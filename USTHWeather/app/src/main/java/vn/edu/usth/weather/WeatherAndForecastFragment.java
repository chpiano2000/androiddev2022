package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherAndForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherAndForecastFragment extends Fragment {

    public WeatherAndForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment WeatherAndForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    // Here is the code to create new instance for the fragment swipe. Really cool
    public static WeatherAndForecastFragment newInstance() {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        WeatherFragment fragment1 = new WeatherFragment();
        ForecastFragment fragment2 = new ForecastFragment();
        getChildFragmentManager().beginTransaction().add(R.id.child_fragment_container, fragment1).add(R.id.child_fragment_container, fragment2).commit();
    }
}