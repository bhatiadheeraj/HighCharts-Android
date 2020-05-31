package com.test.highchartdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.highsoft.highcharts.core.*;
import com.highsoft.highcharts.common.hichartsclasses.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("column");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Demo chart");

        options.setTitle(title);

        HIColumn series = new HIColumn();
        series.setData(new ArrayList<>(Arrays.asList(49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)));
        options.setSeries(new ArrayList<HISeries>(Collections.singletonList(series)));

        chartView.setOptions(options);

    }
}
