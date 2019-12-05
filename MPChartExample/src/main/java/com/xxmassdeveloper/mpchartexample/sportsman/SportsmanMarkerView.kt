package com.xxmassdeveloper.mpchartexample.sportsman

import android.content.Context
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.BubbleEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import kotlinx.android.synthetic.main.custom_marker_sportsman.view.*

class SportsmanMarkerView(context: Context, layoutResource: Int) : MarkerView(context, layoutResource) {

    override fun refreshContent(e: Entry, highlight: Highlight) {

        if (e !is BubbleEntry) return

        val set = chartView.data.getDataSetByIndex(highlight.dataSetIndex)
        nameTV.text = set.label

        dateTV.text = e.data as String
        pulseTV.text = "Pulse: ${e.x.pp()}"
        powerTV.text = "Power: ${e.y.pp()}"
        durationTV.text = "Duration: ${e.size.pp()} min"
    }

    private fun Float.pp() = String.format("%.0f", this)
}