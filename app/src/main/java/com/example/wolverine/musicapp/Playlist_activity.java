package com.example.wolverine.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wolverine on 19/07/18.
 */

public class Playlist_activity extends AppCompatActivity {
    TextView Acyivity_txt, descripe_txt;
    ImageView Image, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        Image = (ImageView) findViewById(R.id.Image_view);
        Image.setImageResource(R.drawable.music_folder);

        Acyivity_txt = (TextView) findViewById(R.id.txt_view);
        Acyivity_txt.setText("PlayList");

        descripe_txt = (TextView) findViewById(R.id.description_txt);
        descripe_txt.setText("this screen show all PlayLists");

        final ArrayList<Songs> playlist = new ArrayList<Songs>();

        playlist.add(new Songs("PlayList 1"));
        playlist.add(new Songs("PlayList 2"));
        playlist.add(new Songs("PlayList 3"));
        playlist.add(new Songs("PlayList 4"));
        playlist.add(new Songs("PlayList 5"));
        playlist.add(new Songs("PlayList 6"));
        playlist.add(new Songs("PlayList 7"));
        playlist.add(new Songs("PlayList 8"));
        playlist.add(new Songs("PlayList 9"));

        MusicAdapter adapter = new MusicAdapter(this, playlist);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),display.class);
                Bundle b = new Bundle();

                b.putString("songName",playlist.get(position).getMsongName());
                b.putString("artistName",playlist.get(position).getMartistName());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
