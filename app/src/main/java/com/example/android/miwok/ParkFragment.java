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
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class ParkFragment extends Fragment {

    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.park_info_one, R.string.park_one,
                R.drawable.park_cimiez));
        words.add(new Word(R.string.park_info_two, R.string.park_two,
                R.drawable.park_roumanie));
        words.add(new Word(R.string.park_info_three, R.string.park_three,
                R.drawable.park_monastere));
        words.add(new Word(R.string.park_info_four, R.string.park_four,
                R.drawable.park_phoenix));
        words.add(new Word(R.string.park_info_five, R.string.park_five,
                R.drawable.park_deux));
        words.add(new Word(R.string.park_info_six, R.string.park_six,
                R.drawable.park_forestier));
        words.add(new Word(R.string.park_info_seven, R.string.park_seven,
                R.drawable.park_estienne));
        words.add(new Word(R.string.park_info_eight, R.string.park_eight,
                R.drawable.park_valrose));
        words.add(new Word(R.string.park_info_nine, R.string.park_nine,
                R.drawable.park_vigier));
        words.add(new Word(R.string.park_info_ten, R.string.park_ten,
                R.drawable.park_canal));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_parks);

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
