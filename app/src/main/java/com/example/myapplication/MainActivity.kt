package com.example.myapplication

import android.content.Entity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.DropBoxManager.Entry
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import java.util.jar.JarEntry

class MainActivity : AppCompatActivity() {
    private lateinit var lineEntry: ArrayList<Entry>
    private lateinit var barEntry:ArrayList<BarEntry>

    private lateinit var myBarEntry: BarChart
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        barEntry= ArrayList()
        barEntry.add(BarEntry(10f,80f))
        barEntry.add(BarEntry(20f,30f))
        barEntry.add(BarEntry(30f,40f))
        barEntry.add(BarEntry(40f,50f))
        barEntry.add(BarEntry(50f,60f))

        myBarEntry=findViewById(R.id.chartBar)

        var datasetBar=BarDataSet(barEntry,"測試指標")
        datasetBar.color=Color.BLUE
        var data1=BarData(datasetBar)
        myBarEntry.data=data1
        myBarEntry.setFitBars(false)
    }
}