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
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by wolverine on 19/07/18.
 */

public class album_activity extends AppCompatActivity {

    TextView Acyivity_txt, descripe_txt;
    ImageView Image, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        Image = (ImageView) findViewById(R.id.Image_view);
        Image.setImageResource(R.drawable.album);

        Acyivity_txt = (TextView) findViewById(R.id.txt_view);
        Acyivity_txt.setText("Album");

        descripe_txt = (TextView) findViewById(R.id.description_txt);
        descripe_txt.setText("this screen show all Albums");

        final ArrayList<Songs> song = new ArrayList<Songs>();

        song.add(new Songs("Album 1", "artist 1"));
        song.add(new Songs("Album 2", "artist 2"));
        song.add(new Songs("Album 3", "artist 3"));
        song.add(new Songs("Album 4", "artist 4"));
        song.add(new Songs("Album 5", "artist 5"));
        song.add(new Songs("Album 6", "artist 6"));
        song.add(new Songs("Album 7", "artist 7"));
        song.add(new Songs("Album 8", "artist 8"));
        song.add(new Songs("Album 9", "artist 9"));

        MusicAdapter adapter = new MusicAdapter(this, song);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),display.class);
                Bundle b = new Bundle();

                b.putString("songName",song.get(position).getMsongName());
                b.putString("artistName",song.get(position).getMartistName());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
