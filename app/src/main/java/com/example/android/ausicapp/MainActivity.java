package com.example.android.ausicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Close description Button to attach the eventListener
        Button closeDescriptionButton = (Button) findViewById(R.id.closeDescriptionButton);

        // Hide
        closeDescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScrollView explanation = (ScrollView) findViewById(R.id.description);
                explanation.setVisibility(View.GONE);
            }
        });
        // Find view by id to assign them event Listeners.
        Button songs = (Button) findViewById(R.id.songs);

        // Set a click listener on the songs Button
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the family View is clicked on.
                Intent songsIntent = new Intent(MainActivity.this, songsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Find view by id to assign them event Listeners.
        Button playlist = (Button) findViewById(R.id.playlist);
        // Set a click listener on the playlist Button
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the family View is clicked on.
                Intent playlistIntent = new Intent(MainActivity.this, playlistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Find view by id to assign them event Listeners.
        Button artist = (Button) findViewById(R.id.artist);

        // Set a click listener on the artist Button
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, artistActivity.class);
                startActivity(artistIntent);
            }
        });

        // Find view by id to assign them event Listeners.
        Button schedule = (Button) findViewById(R.id.schedule);
        // Set a click listener on the schedule Button
        schedule.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent scheduleIntent = new Intent(MainActivity.this, scheduleActivity.class);
                startActivity(scheduleIntent);
            }
        });

        // Find view by id to assign them event Listeners.
        Button share = (Button) findViewById(R.id.share);

        // Set a click listener on the share Button
        share.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(MainActivity.this, shareActivity.class);
                startActivity(shareIntent);
            }
        });
    }
}
