package com.example.ryan.cityofstarkville;

import android.content.Context;
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
        churchPlaces.add(new Place(getString(R.string.StarkvilleCommunityChurchName), getString(R.string.StarkvilleCommunityChurchAddress), R.drawable.starkville_community_church, getString(R.string.StarkvilleCommunityChurchDescription)));
        churchPlaces.add(new Place(getString(R.string.StarkvilleChurchofChristName), getString(R.string.StarkvilleChurchofChristAddress), R.drawable.starkville_church_of_christ, getString(R.string.StarkvilleChurchofChristDescription)));
        churchPlaces.add(new Place(getString(R.string.St_JosephCahtolicChurchName), getString(R.string.St_JoesphCatholicChurchAddress), R.drawable.st_joesph_catholic_church, getString(R.string.St_JoesphCatholicChurchDescription)));
        churchPlaces.add(new Place(getString(R.string.EpiscopalChurchoftheResurrectionName), getString(R.string.EpiscopalChurchoftheResurrectionAddress), R.drawable.episcopal_church_resurrection, getString(R.string.EpiscopalChurchoftheResurrectionDescription)));
        churchPlaces.add(new Place(getString(R.string.FirstUnitedMethodistChurchName), getString(R.string.FirstUnitedMethodistChurchAddress), R.drawable.first_united_methodist_chruch, getString(R.string.FirstUnitedMethodistChurchDescription)));

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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
