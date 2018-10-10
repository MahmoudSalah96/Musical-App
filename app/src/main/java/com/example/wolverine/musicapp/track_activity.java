package com.example.wolverine.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wolverine on 19/07/18.
 */

public class track_activity extends AppCompatActivity {
    TextView Acyivity_txt, descripe_txt;
    ImageView Image, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        Image = (ImageView) findViewById(R.id.Image_view);
        Image.setImageResource(R.drawable.album);

        Acyivity_txt = (TextView) findViewById(R.id.txt_view);
        Acyivity_txt.setText("Track");

        descripe_txt = (TextView) findViewById(R.id.description_txt);
        descripe_txt.setText("this screen show all Tracks");


        final ArrayList<Songs> track = new ArrayList<Songs>();

        track.add(new Songs("Track 1", "Artist 1"));
        track.add(new Songs("Track 2", "Artist 2"));
        track.add(new Songs("Track 3", "Artist 3"));
        track.add(new Songs("Track 4", "Artist 4"));
        track.add(new Songs("Track 5", "Artist 5"));
        track.add(new Songs("Track 6", "Artist 6"));
        track.add(new Songs("Track 7", "Artist 7"));
        track.add(new Songs("Track 8", "Artist 8"));
        track.add(new Songs("Track 9", "Artist 9"));

        MusicAdapter adapter = new MusicAdapter(this, track);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),display.class);
                Bundle b = new Bundle();

                b.putString("songName",track.get(position).getMsongName());
                b.putString("artistName",track.get(position).getMartistName());
                intent.putExtras(b);
                startActivity(intent);
            }
        });


    }
}
