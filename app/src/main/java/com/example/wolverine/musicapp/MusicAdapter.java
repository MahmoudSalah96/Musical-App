package com.example.wolverine.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wolverine on 19/07/18.
 */

public class MusicAdapter extends ArrayAdapter<Songs> {

    public MusicAdapter(Context context, ArrayList<Songs> pWords) {
        super(context, 0,pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }

        Songs local_song = getItem(position);
        TextView songtxt = (TextView) listItemView.findViewById(R.id.song_text_view);
        songtxt.setText(local_song.getMsongName());

        TextView artisttxt = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artisttxt.setText(local_song.getMartistName());

        return listItemView;
    }
}
