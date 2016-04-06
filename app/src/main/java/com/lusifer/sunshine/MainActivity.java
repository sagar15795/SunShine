package com.lusifer.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> Data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakeData();
    }

    private void fakeData() {
        Data=new ArrayList<>();
        Data.add("Mon 6/23 - Sunny - 31/17");
        Data.add("Tue 6/24 - Foggy - 21/8");
        Data.add("Wed 6/25 - Cloudy - 22/17");
        Data.add("Thurs 6/26 - Rainy - 18/11");
        Data.add("Fri 6/27 - Foggy - 21/10");
        Data.add("Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18");
        Data.add("Sun 6/29 - Sunny - 20/7");
    }
}
