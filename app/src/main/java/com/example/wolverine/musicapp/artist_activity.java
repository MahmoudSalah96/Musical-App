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

public class artist_activity extends AppCompatActivity {

    TextView Acyivity_txt, descripe_txt;
    ImageView Image, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        Image = (ImageView) findViewById(R.id.Image_view);
        Image.setImageResource(R.drawable.beyonce);

        Acyivity_txt = (TextView) findViewById(R.id.txt_view);
        Acyivity_txt.setText("Artist");

        descripe_txt = (TextView) findViewById(R.id.description_txt);
        descripe_txt.setText("this screen show all Artists");


        final ArrayList<Songs> artist = new ArrayList<Songs>();

        artist.add(new Songs("Artist 1", "Album 1"));
        artist.add(new Songs("Artist 2", "Album 2"));
        artist.add(new Songs("Artist 3", "Album 3"));
        artist.add(new Songs("Artist 4", "Album 4"));
        artist.add(new Songs("Artist 5", "Album 5"));
        artist.add(new Songs("Artist 6", "Album 6"));
        artist.add(new Songs("Artist 7", "Album 7"));
        artist.add(new Songs("Artist 8", "Album 8"));
        artist.add(new Songs("Artist 9", "Album 9"));

        MusicAdapter adapter = new MusicAdapter(this, artist);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),display.class);
                Bundle b = new Bundle();

                b.putString("songName",artist.get(position).getMsongName());
                b.putString("artistName",artist.get(position).getMartistName());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
