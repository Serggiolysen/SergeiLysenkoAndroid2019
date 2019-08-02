package by.itacademy.pvtjune.dz.dz4

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import by.itacademy.myapplication.R
import java.text.SimpleDateFormat
import java.util.*

class Dz4CustomView : View {

    private val circlePaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val circle2Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rectPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rectPaint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rectF = RectF()
    private val seconds = SimpleDateFormat("s", Locale.getDefault()).format(Date())
    private val currientDate = SimpleDateFormat(
        "dd MMMMM yyyy HH:mm:ss", Locale.getDefault()
    ).format(Date())
    private val dateInHoursFormatted = SimpleDateFormat(
        "K",
        Locale.getDefault()
    ).format(Date())
    private val dateInMinutesFormatted = SimpleDateFormat(
        "m",
        Locale.getDefault()
    ).format(Date())

    private var cx = 0F
    private var cy = 0F
    private var radius = 0F
    private var radius2circle = 0F

    init {
        circlePaint.color = ContextCompat.getColor(context, R.color.black)
        circle2Paint.color = ContextCompat.getColor(context, R.color.white)
        rectPaint.color = ContextCompat.getColor(context, R.color.red)
        rectPaint2.color = ContextCompat.getColor(context, R.color.blue)
    }

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)
            : super(
        context, attrs, defStyleAttr, defStyleRes
    )

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val modeWidth = MeasureSpec.getMode(widthMeasureSpec)

        val sizeWidth = MeasureSpec.getSize(widthMeasureSpec)
        val sizeHeight = MeasureSpec.getSize(heightMeasureSpec)

        var customSizeHeight = 0
        var customSizeWidth = 0

        when (modeWidth) {
            MeasureSpec.EXACTLY -> {
                customSizeWidth = sizeWidth
                customSizeHeight = sizeHeight
            }
            MeasureSpec.AT_MOST -> {
                customSizeWidth = sizeWidth * 8 / 10
                customSizeHeight = sizeHeight
            }
            MeasureSpec.UNSPECIFIED -> {
                Log.e("AAA", "UNSPECIFIED")
            }
        }
        setMeasuredDimension(customSizeWidth, customSizeHeight)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        cx = width / 2F
        cy = height / 2F
        radius = Math.min(width, height) / 2F
        radius2circle = radius - 20

        rectF.left = 0F
        rectF.top = cy - radius
        rectF.right = radius * 2
        rectF.bottom = cy + radius

    }

    override fun onDraw(canvas: Canvas?) {

        super.onDraw(canvas)
        canvas ?: return

        canvas.drawCircle(cx, cy, radius, circlePaint)

        canvas.drawCircle(cx, cy, radius2circle, circle2Paint)

        canvas.save()

        canvas.scale(4F, 4F)

        canvas.drawText("12", cx / 4 - 8, (cy - radius) / 4 + 20, rectPaint)

        canvas.drawText("3", (cx + radius) / 4 - 18, cy / 4 + 3, rectPaint)

        canvas.drawText("6", cx / 4 - 3, (cy + radius) / 4 - 11, rectPaint)

        canvas.drawText("9", (cx - radius) / 4 + 12, cy / 4 + 5, rectPaint)

        canvas.restore()

        canvas.save()

        for (i in 1..12) {

            canvas.rotate(30F, cx, cy)
            canvas.drawRect(cx - 10, cy - radius, cx, cy - radius + 30, circlePaint)
        }

        canvas.restore()

        canvas.save()

        canvas.rotate(

            (dateInHoursFormatted.toFloat() + dateInMinutesFormatted.toFloat() / 60) * 30,
            cx, cy

        )

        canvas.drawArc(

            rectF, 268F, 4F, true,
            rectPaint

        )

        canvas.restore()

        canvas.save()

        canvas.rotate(dateInMinutesFormatted.toFloat() * 6, cx, cy)

        canvas.drawArc(

            rectF, 269F, 2F, true,
            rectPaint2

        )

        canvas.restore()

        canvas.drawCircle(cx, cy, 20F, circlePaint)

        canvas.save()

        canvas.scale(4F, 4F)

        canvas.drawText(currientDate, cx / 4 - cx / 8, cy / 4 + cy / 7, rectPaint)

        canvas.restore()
             //zkjdkjfskdfkjhslkjdfgksdlfkjg
    }
}