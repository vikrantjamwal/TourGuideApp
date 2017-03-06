package com.android.vik.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.tajMahal), R.drawable.tajmahal));
        locations.add(new Location(getString(R.string.indiaGate), R.drawable.indiagate));
        locations.add(new Location(getString(R.string.gatewayOfIndia), R.drawable.gatewayofindia));
        locations.add(new Location(getString(R.string.redFort), R.drawable.redfort));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
