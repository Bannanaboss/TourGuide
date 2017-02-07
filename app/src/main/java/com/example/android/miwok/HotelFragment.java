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
 * {@link Fragment} that displays a list of hotels with prices.
 */
public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.hotel_price_one, R.string.hotel_name_one,
                R.drawable.hotel_beau));
        words.add(new Word(R.string.hotel_price_two, R.string.hotel_name_two,
                R.drawable.hotel_albert));
        words.add(new Word(R.string.hotel_price_three, R.string.hotel_name_three,
                R.drawable.hotel_mer));
        words.add(new Word(R.string.hotel_price_four, R.string.hotel_name_four,
                R.drawable.hotel_meridien));
        words.add(new Word(R.string.hotel_price_five, R.string.hotel_name_five,
                R.drawable.hotel_nh));
        words.add(new Word(R.string.hotel_price_six, R.string.hotel_name_six,
                R.drawable.hotel_esatitude));
        words.add(new Word(R.string.hotel_price_seven, R.string.hotel_name_seven,
                R.drawable.hotel_blu));
        words.add(new Word(R.string.hotel_price_eight, R.string.hotel_name_eight,
                R.drawable.hotel_aston));
        words.add(new Word(R.string.hotel_price_nine, R.string.hotel_name_nine,
                R.drawable.hotel_b4));
        words.add(new Word(R.string.hotel_price_ten, R.string.hotel_name_ten,
                R.drawable.hotel_radisson));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_hotels);

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
