package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WeatherFragment extends Fragment {

    private String weatherString = "Current Weather";

    public WeatherFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_weather, container, false);

        TextView textWeather = rootView.findViewById(R.id.txtWeather);
        textWeather.setText(weatherString);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        FetchWeatherTask task = new FetchWeatherTask(this);
        task.execute();
    }

    public void setWeatherString(String weatherString) {
        TextView textView = getActivity().findViewById(R.id.txtWeather);
        textView.setText(weatherString);
    }
}
