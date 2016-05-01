package com.lusifer.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_acivity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView detail=(TextView) findViewById(R.id.tvDetail);
        Intent intent = getIntent();
        detail.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.forecastfragment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.action_setting) {
            Intent intent = new Intent(DetailAcivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }
        return true;
    }
}
