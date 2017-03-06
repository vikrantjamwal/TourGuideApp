package com.android.vik.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsFragment extends Fragment {

    public MallsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list,container,false);

        ArrayList<Location> locations = new ArrayList <Location>();

        locations.add(new Location(getString(R.string.luluMall)));
        locations.add(new Location(getString(R.string.orionMall)));
        locations.add(new Location(getString(R.string.southMall)));
        locations.add(new Location(getString(R.string.inOrbitMall)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
