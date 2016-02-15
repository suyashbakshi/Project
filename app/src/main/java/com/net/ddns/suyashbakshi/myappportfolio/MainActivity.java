package com.net.ddns.suyashbakshi.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        Button spotify = (Button)findViewById(R.id.spotifyBtn);
        Button scores = (Button)findViewById(R.id.scoresBtn);
        Button library = (Button)findViewById(R.id.libBtn);
        Button bib = (Button)findViewById(R.id.bibBtn);
        Button xyz = (Button)findViewById(R.id.xyzBtn);
        Button capstone = (Button)findViewById(R.id.capstoneBtn);

        spotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "This will launch Spotify App.";
                Toast toast = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        scores.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "This will launch Scores App.";
                Toast toast = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        library.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "This will launch Library App.";
                Toast toast = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        bib.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "This will launch Build It Bigger App.";
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        xyz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "This will launch XYZ Reader.";
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        capstone.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "This will launch Capstone App.";
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
