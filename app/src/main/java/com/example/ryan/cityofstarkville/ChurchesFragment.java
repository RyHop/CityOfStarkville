package com.example.ryan.cityofstarkville;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ChurchesFragment extends Fragment {
    ArrayList<Place> churchPlaces = new ArrayList<>();


    public ChurchesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        churchPlaces.add(new Place("Starkville Community Church", "1010 Lynn Ln, Starkville, MS 39759", R.drawable.starkville_community_church, "A Baptist Church"));
        churchPlaces.add(new Place("Starkville Church of Christ", "613 E Lee Blvd, Starkville, MS 39759", R.drawable.starkville_church_of_christ, "A popular college students church"));
        churchPlaces.add(new Place("St.Joseph Catholic Church", "607 University Dr, Starkville, MS 39759", R.drawable.st_joesph_catholic_church, "A Catholic Church"));
        churchPlaces.add(new Place("Episcopal Church of the Resurrection", "105 N Montgomery St Starkville MS 39759", R.drawable.episcopal_church_resurrection, "An Episcopal Chruch"));
        churchPlaces.add(new Place("First United Methodist Church", "300 W Lampkin St", R.drawable.first_united_methodist_chruch, "A Methodist Church"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_place_layout, container, false);
        ListView attractionsListView = rootView.findViewById(R.id.default_listView);
        CustomPlaceAdapter thePlaceAdapter = new CustomPlaceAdapter(getContext(), churchPlaces);
        attractionsListView.setAdapter(thePlaceAdapter);


        // Inflate the layout for this fragment
        return rootView;
    }

    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
