package com.lusifer.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.list_item_forcast,
                R.id.list_item_forcast_textview,
                fakeData());
        ListView listView=(ListView)findViewById(R.id.listview_forecast);
        listView.setAdapter(stringArrayAdapter);
    }

    private ArrayList<String> fakeData() {
        ArrayList<String> data = new ArrayList<>();
        data.add("Mon 6/23 - Sunny - 31/17");
        data.add("Tue 6/24 - Foggy - 21/8");
        data.add("Wed 6/25 - Cloudy - 22/17");
        data.add("Thurs 6/26 - Rainy - 18/11");
        data.add("Fri 6/27 - Foggy - 21/10");
        data.add("Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18");
        data.add("Sun 6/29 - Sunny - 20/7");
        return data;
    }
}
