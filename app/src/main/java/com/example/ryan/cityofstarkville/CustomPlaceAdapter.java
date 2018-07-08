package com.example.ryan.cityofstarkville;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomPlaceAdapter extends ArrayAdapter<Place> {
    public CustomPlaceAdapter(@NonNull Context context, ArrayList<Place> placeArrayList) {
        super(context, 0, placeArrayList);
    }

    @Nullable
    @Override
    public Place getItem(int position) {


        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview_of_places, parent, false);
        }

        // Get the Word object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.textView1);
        // set this text on the name TextView
        placeNameTextView.setText(currentPlace.getPlaceName());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView placeAddressTextView = (TextView) listItemView.findViewById(R.id.textView2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        placeAddressTextView.setText(currentPlace.getAddressOfPlace());

        //Description of the object.
        TextView placeDescriptionTextView = (TextView) listItemView.findViewById(R.id.textView3);
        placeDescriptionTextView.setText(currentPlace.getDescriptionOfPlace());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        //Figuring I could also cast an imageView within the viws. The Udacity link found in the classes provided reference.
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.placePicture);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        placeImageView.setImageResource(currentPlace.getPictureOfPlace());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
