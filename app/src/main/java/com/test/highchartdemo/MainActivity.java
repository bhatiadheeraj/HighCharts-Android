package com.test.highchartdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.highsoft.highcharts.core.*;
import com.highsoft.highcharts.common.hichartsclasses.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        HITitle hiTitle = new HITitle();
        hiTitle.setText("Close contacts Trend");
        options.setTitle(hiTitle);

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Percentage of users");
        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));


        final HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"MAY 20", "MAY 21", "MAY 22", "MAY 23","MAY 24","MAY 25","MAY 26"};
        xAxis.setCategories(new ArrayList<>(asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.setSeries(new HISeries());
        plotoptions.getSeries().setLabel(new HILabel());
        plotoptions.getSeries().getLabel().setConnectorAllowed(false);
        options.setPlotOptions(plotoptions);

        HILine series1 = new HILine();
        series1.setName("less than 5");
        Number[] series1_data = new Number[] {55, 52, 60, 20, 36, 35, 30};
        series1.setData(new ArrayList<>(asList(series1_data)));
        HILine series2 = new HILine();
        series2.setName("greater than 5 and less than 10");
        Number[] series2_data = new Number[] {20, 28, 25, 30, 24, 20, 14};
        series2.setData(new ArrayList<>(asList(series2_data)));

        HILine series3 = new HILine();
        series3.setName("greater than 10");
        Number[] series3_data = new Number[] {25, 20, 15, 50, 40, 45, 56};
        series3.setData(new ArrayList<>(asList(series3_data)));

        options.setSeries(new ArrayList<HISeries>(asList(series1, series2,series3)));
        chartView.setOptions(options);

    }
}
