package com.example.gregoryesrig24.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;
import static com.example.gregoryesrig24.finalproject.R.id.toolbar;

/**
 * Created by gregoryesrig24 on 4/10/17.
 */

public class GiveProfile extends AppCompatActivity {

    private Button givingbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giveprofile);

        givingbtn = (Button) findViewById(R.id.giveButton);


        givingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiveProfile.this, SelectionActivity.class));
            }
        });


        Toolbar actionBarToolbar = (Toolbar) findViewById(toolbar);
        setSupportActionBar(actionBarToolbar);

        getSupportActionBar().setTitle("");

    }
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();

        if (res_id == R.id.settings) {
            startActivity(new Intent(GiveProfile.this, MainActivity.class));
        }

        return true;
    }



    }



