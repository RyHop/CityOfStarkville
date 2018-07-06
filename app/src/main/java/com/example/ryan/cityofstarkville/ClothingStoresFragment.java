package com.example.ryan.cityofstarkville;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ClothingStoresFragment extends Fragment {
    ArrayList<Place> clothingPlaces = new ArrayList<>();


    public ClothingStoresFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        clothingPlaces.add(new Place("JCPenney", "864 Hwy 12 W, Starkville, MS 39759", R.drawable.jc_penney, "Everyone goes here at least once."));
        clothingPlaces.add(new Place("Bargain Hunt", " 404 MS-12, Starkville, MS 39759", R.drawable.bargain_hunt, "The cheapest I've ever seen of underwear."));
        clothingPlaces.add(new Place("Dirt Cheap", "800 Louisville St, Starkville, MS 39759", R.drawable.dirt_cheap, "Try on expensive clothes and have a shopping spree for under a dollar."));
        clothingPlaces.add(new Place("Academy Sports + Outdoors", "160 Hollywood Boulevard, Starkville,MS 39759", R.drawable.academy_sports, "Oddly have nice clothes and shoes."));
        clothingPlaces.add(new Place("Rue21", "622 Highway 12 East, Starkville, MS 39759", R.drawable.rue21, "Fashion for men and women...that's rare."));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_place_layout, container, false);
        ListView attractionsListView = rootView.findViewById(R.id.default_listView);
        CustomPlaceAdapter thePlaceAdapter = new CustomPlaceAdapter(getContext(), clothingPlaces);
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
