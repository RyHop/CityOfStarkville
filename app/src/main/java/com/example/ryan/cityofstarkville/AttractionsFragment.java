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
        attractionsPlaces.add(new Place("Mississippi State University", "198 Lee Blvd, Mississippi State, MS 39762", R.drawable.msu, "A diverse university for any student pursuing higher studies"));
        attractionsPlaces.add(new Place("Showtimes at Hollywood Premier Cinemas", "101 Hollywood Boulevard, Starkville, MS 39759", R.drawable.movie_theater, "A movie theater showing the latest movies."));
        attractionsPlaces.add(new Place("CULLIS & GLADYS WADE CLOCK MUSEUM", " 75 B.S. Hood Drive, Cullis Wade Depot, Mississippi State, MS 39762", R.drawable.clock_museum, "A clock museum, what more do I need to say!"));
        attractionsPlaces.add(new Place("The Last Page, LLC", "101 S. Washington St.,Starkville, MS 39759", R.drawable.comic_books, "A comic book store that has a comic any fantasies."));
        attractionsPlaces.add(new Place("Book Mart & Cafe", "120 E Main St, Starkville, MS 39759", R.drawable.book_mart_cafe, "Eating food while you're reading? Please go there."));
        attractionsPlaces.add(new Place("The Lodge", "408 MS-12, Starkville, MS 39759", R.drawable.the_lodge, "Everything apparel of Mississippi State University. Expensive but worth it."));
        attractionsPlaces.add(new Place("Historic Hotel Chester", "101 N Jackson St, Starkville, MS", R.drawable.historic_hotel_chester, "Gordon Ramsey went there..."));
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
