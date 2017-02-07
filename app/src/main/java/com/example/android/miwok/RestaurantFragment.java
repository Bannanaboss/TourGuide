package com.example.android.miwok;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.restaurant_price_one, R.string.restaurant_one,
                R.drawable.restaurant_jan));
        words.add(new Word(R.string.restaurant_price_three, R.string.restaurant_three,
                R.drawable.restaurant_millesime));
        words.add(new Word(R.string.restaurant_price_two, R.string.restaurant_two,
                R.drawable.restaurant_sens));
        words.add(new Word(R.string.restaurant_price_four, R.string.restaurant_four,
                R.drawable.restaurant_sejour));
        words.add(new Word(R.string.restaurant_price_five, R.string.restaurant_five,
                R.drawable.restaurant_illia));
        words.add(new Word(R.string.restaurant_price_seven, R.string.restaurant_seven,
                R.drawable.restaurant_antica));
        words.add(new Word(R.string.restaurant_price_six, R.string.restaurant_six,
                R.drawable.restaurant_maizon));
        words.add(new Word(R.string.restaurant_price_eight, R.string.restaurant_eight,
                R.drawable.restaurant_octopussy));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
