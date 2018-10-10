package com.example.wolverine.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout playlist, albums, artist, track;
    LinearLayout music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playlist = (RelativeLayout) findViewById(R.id.Playlist_view);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Playlist_activity.class);
                startActivity(intent);
            }
        });

        albums = (RelativeLayout) findViewById(R.id.album_view);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), album_activity.class);
                startActivity(intent);
            }
        });

        artist = (RelativeLayout) findViewById(R.id.artist_view);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), artist_activity.class);
                startActivity(intent);
            }
        });

        track = (RelativeLayout) findViewById(R.id.track_view);
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), track_activity.class);
                startActivity(intent);
            }
        });

        music = (LinearLayout) findViewById(R.id.Music_view);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Not Working. \nComming soon!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
