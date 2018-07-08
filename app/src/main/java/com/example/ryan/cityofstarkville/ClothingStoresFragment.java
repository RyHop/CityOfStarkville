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
        clothingPlaces.add(new Place(getString(R.string.JCPName), getString(R.string.JCPAddress), R.drawable.jc_penney, getString(R.string.JCPDescription)));
        clothingPlaces.add(new Place(getString(R.string.BargainName), getString(R.string.BargainAddress), R.drawable.bargain_hunt, getString(R.string.BargainDescription)));
        clothingPlaces.add(new Place(getString(R.string.DirtName), getString(R.string.DirtAddress), R.drawable.dirt_cheap, getString(R.string.DirtDescription)));
        clothingPlaces.add(new Place(getString(R.string.AcademyName), getString(R.string.AcademyAddress), R.drawable.academy_sports, getString(R.string.AcademyDescription)));
        clothingPlaces.add(new Place(getString(R.string.RueName), getString(R.string.RueAddress), R.drawable.rue21, getString(R.string.RueDescription)));

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
