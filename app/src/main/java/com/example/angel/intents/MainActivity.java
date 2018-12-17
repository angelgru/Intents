package com.example.angel.intents;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dialButton, pickButton, searchButton, viewButton, webSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialButton = findViewById(R.id.action_dial_button);
        dialButton.setOnClickListener(this);

        pickButton = findViewById(R.id.action_pick_button);
        pickButton.setOnClickListener(this);

        searchButton = findViewById(R.id.action_search_button);
        searchButton.setOnClickListener(this);

        viewButton = findViewById(R.id.action_view_button);
        viewButton.setOnClickListener(this);

        webSearchButton = findViewById(R.id.action_web_search_button);
        webSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.action_dial_button:
                Intent intent = new Intent(
                        Intent.ACTION_DIAL, Uri.parse("tel:123-123"));
                startActivity(intent);
                break;
            case R.id.action_pick_button:
                Intent intent1 = new Intent(
                        Intent.ACTION_PICK,
                        Uri.parse("content://contacts/people")
                );
                startActivity(intent1);
                break;
            case R.id.action_search_button:
                Intent intent2 = new Intent(
                        Intent.ACTION_SEARCH, null
                );
                intent2.putExtra(SearchManager.QUERY, "Spring Boot development");
                startActivity(intent2);
                break;
            case R.id.action_view_button:
                Intent intent3 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://kajgana.com")
                );
                startActivity(intent3);
                break;
            case R.id.action_web_search_button:
                Intent intent4 = new Intent(
                        Intent.ACTION_WEB_SEARCH, null);
                intent4.putExtra(SearchManager.QUERY, "dummy search query");
                startActivity(intent4);
                break;
        }
    }
}
