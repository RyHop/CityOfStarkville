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
        restaurantPlaces.add(new Place(getString(R.string.MoeName), getString(R.string.MoeAddress), R.drawable.moe_bbq, getString(R.string.MoeDescription)));
        restaurantPlaces.add(new Place(getString(R.string.InsomniaName), getString(R.string.InsomniaAddress), R.drawable.insomnia_cookies, getString(R.string.INsomniaDescription)));
        restaurantPlaces.add(new Place(getString(R.string.BaskinName), getString(R.string.BaskinAddress), R.drawable.baskin_robbins, getString(R.string.BaskinDescription)));
        restaurantPlaces.add(new Place(getString(R.string.HarveysName), getString(R.string.HarveysAddress), R.drawable.harveys, getString(R.string.HarveysDescription)));
        restaurantPlaces.add(new Place(getString(R.string.StromName), getString(R.string.StromAddress), R.drawable.strombolis, getString(R.string.StromDescription)));
        restaurantPlaces.add(new Place(getString(R.string.NineName), getString(R.string.NineAddress), R.drawable.ninetonine, getString(R.string.NineDescription)));
        restaurantPlaces.add(new Place(getString(R.string.BinName), getString(R.string.BinAddress), R.drawable.bin162, getString(R.string.BinDescription)));
        restaurantPlaces.add(new Place(getString(R.string.BiscuitName), getString(R.string.BiscuitAddress), R.drawable.biscuit_shop, getString(R.string.BiscuitDescription)));

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
