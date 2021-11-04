package com.nsolution.nfood.Animation

import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ProgressBar

class ProgressBarAnimation(val progressBar: ProgressBar?, val from: Int, val to: Int) : Animation() {
  
  override fun applyTransformation(interpolatedTime: Float, t: Transformation?) {
    super.applyTransformation(interpolatedTime, t)
    val value = from + (to - from) * interpolatedTime
    progressBar?.progress = value.toInt()
  }
  
}