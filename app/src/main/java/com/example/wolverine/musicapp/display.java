package com.example.wolverine.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle b = getIntent().getExtras();

        TextView songname = (TextView)findViewById(R.id.song_text);
        songname.setText(b.getString("songName"));

        TextView artistname = (TextView)findViewById(R.id.artist_text);
        artistname.setText(b.getString("artistName"));

    }
}
