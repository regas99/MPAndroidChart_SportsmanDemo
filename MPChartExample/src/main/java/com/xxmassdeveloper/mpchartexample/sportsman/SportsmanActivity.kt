package com.xxmassdeveloper.mpchartexample.sportsman

import android.os.Bundle
import android.view.View
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.BubbleData
import com.github.mikephil.charting.data.BubbleDataSet
import com.github.mikephil.charting.data.BubbleEntry
import com.xxmassdeveloper.mpchartexample.BubbleChartActivity
import com.xxmassdeveloper.mpchartexample.R
import java.util.*

class SportsmanActivity: BubbleChartActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        seekBarX.visibility = View.GONE
        seekBarY.visibility = View.GONE
        tvX.visibility = View.GONE
        tvY.visibility = View.GONE

        val markerView: MarkerView = SportsmanMarkerView(this, R.layout.custom_marker_sportsman)

        with (chart) {

            xAxis.apply {
                axisMinimum = 125f
                axisMaximum = 200f
            }

            axisLeft.apply {
                axisMinimum = 40f
                axisMaximum = 160f
            }

            description.apply {
                title = "Best Sportsmen Training Data"
                this.setPosition(30F, 30F)
            }

            renderer = BigBubbleChartRenderer(chart, animator, viewPortHandler)

            markerView.chartView = this
            marker = markerView

            legend.apply {
                horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
                verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
                orientation = Legend.LegendOrientation.HORIZONTAL
            }
        }
    }

    override fun makeData(count: Int, range: Int): BubbleData {

        val data1 = ArrayList<BubbleEntry>()
        data1.add(BubbleEntry(184F, 113F, 120F, "10/13/2014"))
        data1.add(BubbleEntry(180F, 94F, 45F, "03/25/2015"))
        data1.add(BubbleEntry(145F, 137F, 123F, "11/23/2014"))
        data1.add(BubbleEntry(136F, 89F, 89F, "02/02/2015"))
        data1.add(BubbleEntry(180F, 96F, 118F, "12/24/2014"))
        data1.add(BubbleEntry(149F, 113F, 60F, "11/20/2014"))
        data1.add(BubbleEntry(161F, 94F, 87F, "04/10/2015"))
        data1.add(BubbleEntry(168F, 141F, 45F, "02/03/2015"))
        data1.add(BubbleEntry(173F, 127F, 89F, "01/14/2015"))
        Collections.sort(data1, sortByX)

        val data2 = ArrayList<BubbleEntry>()
        data2.add(BubbleEntry(165F, 145F, 95F, "10/22/2014"))
        data2.add(BubbleEntry(147F, 71F, 53F, "07/25/2014"))
        data2.add(BubbleEntry(157F, 138F, 115F, "08/18/2014"))
        data2.add(BubbleEntry(179F, 107F, 91F, "07/05/2014"))
        data2.add(BubbleEntry(187F, 65F, 90F, "06/21/2014"))
        data2.add(BubbleEntry(142F, 139F, 94F, "11/05/2014"))
        data2.add(BubbleEntry(136F, 90F, 90F, "06/22/2014"))
        data2.add(BubbleEntry(166F, 70F, 54F, "09/18/2014"))
        data2.add(BubbleEntry(161F, 131F, 121F, "01/07/2015"))
        Collections.sort(data2, sortByX)

        val data3 = ArrayList<BubbleEntry>()
        data3.add(BubbleEntry(145F, 141F, 95F, "09/15/2014"))
        data3.add(BubbleEntry(174F, 144F, 53F, "10/28/2014"))
        data3.add(BubbleEntry(180F, 94F, 115F, "03/03/2015"))
        data3.add(BubbleEntry(170F, 142F, 91F, "10/29/2014"))
        data3.add(BubbleEntry(146F, 120F, 90F, "02/28/2015"))
        data3.add(BubbleEntry(164F, 66F, 94F, "06/24/2014"))
        data3.add(BubbleEntry(166F, 137F, 90F, "03/24/2015"))
        data3.add(BubbleEntry(181F, 121F, 54F, "06/02/2014"))
        Collections.sort(data3, sortByX)

        val data4 = ArrayList<BubbleEntry>()
        data4.add(BubbleEntry(169F, 84F, 46F, "05/16/2014"))
        data4.add(BubbleEntry(176F, 123F, 43F, "01/10/2015"))
        data4.add(BubbleEntry(163F, 106F, 105F, "08/06/2014"))
        data4.add(BubbleEntry(167F, 96F, 90F, "09/01/2014"))
        data4.add(BubbleEntry(162F, 131F, 91F, "05/24/2014"))
        data4.add(BubbleEntry(142F, 124F, 112F, "12/24/2014"))
        data4.add(BubbleEntry(142F, 70F, 56F, "01/16/2015"))
        data4.add(BubbleEntry(174F, 89F, 90F, "02/09/2015"))
        Collections.sort(data4, sortByX)

        val set1 = BubbleDataSet(data1, "Christopher Sanchez")
        set1.color = 0xc092caf9.toInt()

        val set2 = BubbleDataSet(data2, "Judy Evans")
        set2.color = 0xc05f9fdf.toInt()

        val set3 = BubbleDataSet(data3, "Walter Burke")
        set3.color = 0xc0f4984d.toInt()

        val set4 = BubbleDataSet(data4, "Daniel Williamson")
        set4.color = 0xc0ffe184.toInt()


        return BubbleData(set1, set2, set3, set4).apply {
            setDrawValues(false)
            setHighlightCircleWidth(1.5f)
        }
    }

    var sortByX = Comparator<BubbleEntry> { o1, o2 -> o1.x.compareTo(o2.x) }

}