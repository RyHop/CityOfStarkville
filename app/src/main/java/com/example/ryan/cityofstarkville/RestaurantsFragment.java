package com.example.ryan.cityofstarkville;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {
    ArrayList<Place> restaurantPlaces = new ArrayList<>();


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        restaurantPlaces.add(new Place("Moe's BBQ", "110 E Main St, Starkville, MS 39759", R.drawable.moe_bbq, "Looking for wings? They have among the best!"));
        restaurantPlaces.add(new Place("Insomnia Cookies", "87 Mill Street, 3, Starkville, MS 39759", R.drawable.insomnia_cookies, "The BEST cookies in Starkville at 1 AM"));
        restaurantPlaces.add(new Place("Baskin-Robbins", "868 MS-12, Starkville, MS 39759", R.drawable.baskin_robbins, "That Ice Cream parlor that no one tries, but its secretly the best one."));
        restaurantPlaces.add(new Place("Harveys", "406 Hwy 12 E, Starkville, MS 39759", R.drawable.harveys, "Its expensive but you like it too much...and everyone likes it too much"));
        restaurantPlaces.add(new Place("Stromboli's", "408 University Dr, Starkville, MS 39759", R.drawable.strombolis, "Pizza's lovers prayer of a sacred pizza shop"));
        restaurantPlaces.add(new Place("Nine-Twentynine Coffee Bar", "106 E Main St, Starkville, MS 39759", R.drawable.ninetonine, "Yo, can coffee be this good?"));
        restaurantPlaces.add(new Place("Bin 612", "612 University Dr #3, Starkville, MS 39759", R.drawable.bin162, "Go during the day if you want good food. Go during the night if you want social people"));
        restaurantPlaces.add(new Place("The Biscuit Shop", "104 S Washington St #3, Starkville, MS 39759", R.drawable.biscuit_shop, "4.3/5 Stars on Google..."));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_place_layout, container, false);
        ListView attractionsListView = rootView.findViewById(R.id.default_listView);
        CustomPlaceAdapter thePlaceAdapter = new CustomPlaceAdapter(getContext(), restaurantPlaces);
        attractionsListView.setAdapter(thePlaceAdapter);

        // Inflate the layout for this fragment
        return rootView;
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
