package com.example.ryan.cityofstarkville;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {
    ArrayList<Place> attractionsPlaces = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attractionsPlaces.add(new Place(getString(R.string.MSUName), getString(R.string.MSUAddress), R.drawable.msu, getString(R.string.MSUDescription)));
        attractionsPlaces.add(new Place(getString(R.string.TheatreName), getString(R.string.TheatreAddress), R.drawable.movie_theater, getString(R.string.TheatreDescription)));
        attractionsPlaces.add(new Place(getString(R.string.ClockMuseumName), getString(R.string.ClockMuseumAddress), R.drawable.clock_museum, getString(R.string.ClockMuseumDescription)));
        attractionsPlaces.add(new Place(getString(R.string.ComicBookStoreName), getString(R.string.ComicBookStoreAddress), R.drawable.comic_books, getString(R.string.ComicBookStoreDescription)));
        attractionsPlaces.add(new Place(getString(R.string.BookMartName), getString(R.string.BookMartAddress), R.drawable.book_mart_cafe, getString(R.string.BookMartDescription)));
        attractionsPlaces.add(new Place(getString(R.string.LodgeName), getString(R.string.LodgeAddress), R.drawable.the_lodge, getString(R.string.LodgeDescription)));
        attractionsPlaces.add(new Place(getString(R.string.ChesterName), getString(R.string.ChesterAddress), R.drawable.historic_hotel_chester, getString(R.string.ChesterDescription)));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_place_layout, container, false);
        ListView attractionsListView = rootView.findViewById(R.id.default_listView);
        CustomPlaceAdapter thePlaceAdapter = new CustomPlaceAdapter(getContext(), attractionsPlaces);
        attractionsListView.setAdapter(thePlaceAdapter);


        // Inflate the layout for this fragment
        return rootView;
    }


}
