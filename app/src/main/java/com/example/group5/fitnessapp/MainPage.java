package com.example.group5.fitnessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;


public class MainPage extends AppCompatActivity {

BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        barChart = findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(44f,0));
        barEntries.add(new BarEntry(44f,1));
        barEntries.add(new BarEntry(44f,2));
        barEntries.add(new BarEntry(44f,3));
        barEntries.add(new BarEntry(44f,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Dates");

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("Monday");
        theDates.add("Tuesday");
        theDates.add("Wednesday");
        theDates.add("Thrusday");
        theDates.add("Friday");

        BarData theData = new BarData((IBarDataSet) theDates,barDataSet);
        barChart.setData(theData);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }

    }

