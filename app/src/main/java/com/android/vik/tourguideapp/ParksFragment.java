package com.android.vik.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list,container,false);

        ArrayList<Location> locations = new ArrayList <Location>();

        locations.add(new Location(getString(R.string.corbettPark)));
        locations.add(new Location(getString(R.string.girPark)));
        locations.add(new Location(getString(R.string.kazirangaPark)));
        locations.add(new Location(getString(R.string.kanhaPark)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;

    }

}
