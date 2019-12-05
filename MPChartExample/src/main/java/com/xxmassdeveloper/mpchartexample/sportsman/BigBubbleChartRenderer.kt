package com.xxmassdeveloper.mpchartexample.sportsman

import com.github.mikephil.charting.animation.ChartAnimator
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
import com.github.mikephil.charting.renderer.BubbleChartRenderer
import com.github.mikephil.charting.utils.ViewPortHandler

/**
 * Draws BubbleEntry's with a diameter directly proportional to the size field,
 * by simply skipping the size calculations.
 */
class BigBubbleChartRenderer(chart: BubbleDataProvider, animator: ChartAnimator?, viewPortHandler: ViewPortHandler?) : BubbleChartRenderer(chart, animator, viewPortHandler) {

    override fun getShapeSize(entrySize: Float, maxSize: Float,
                               reference: Float, normalizeSize: Boolean): Float {
         return entrySize
     }
}