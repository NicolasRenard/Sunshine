package com.example.nicolasrenard.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] fakeData = {
                "Today - Sunny - 20/12",
                "Sunday - Rainy - 16/9",
                "Monday - Rainy - 16/10",
                "Tuesday - Cloudy -17/9"
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(fakeData));

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);

        ListView view = (ListView) fragmentView.findViewById(R.id.listview_forecast);
        view.setAdapter(forecastAdapter);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
