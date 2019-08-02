//package by.itacademy.pvtjune.dz.dz5
//
//import android.content.Context
//import android.graphics.Canvas
//import android.graphics.Paint
//import android.graphics.RectF
//import android.util.AttributeSet
//import android.util.Log
//import android.view.View
//import androidx.core.content.ContextCompat
//import by.itacademy.myapplication.R
//
//class Dz5DiagramView : View {
//
//    private val arcPaint = Paint(Paint.ANTI_ALIAS_FLAG)
//    private val arcPaint2 = Paint(Paint.ANTI_ALIAS_FLAG)
//    private val arcPaint3 = Paint(Paint.ANTI_ALIAS_FLAG)
//    private val rectF = RectF()
//    private var cx = 0F
//    private var cy = 0F
//    private var radius = 0F
//    private val numbers = arrayListOf(11, 72, 140)
//    private val listOfAngles = mutableListOf<Float>()
//    private val listArcs = mutableListOf<Paint>()
//
//    init {
//        Log.d("TAGGG", "init")
//
//        arcPaint.color = ContextCompat.getColor(context, R.color.green)
//        arcPaint2.color = ContextCompat.getColor(context, R.color.blue)
//        arcPaint3.color = ContextCompat.getColor(context, R.color.yellow)
//
//        var sum = 0
//        for (i in numbers) sum += i
//
//        for (j in numbers) listOfAngles.add(j.toFloat() * 100 / sum * 3.6F)
//    }
//
//    constructor(context: Context?) : super(context)
//    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
//    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
//            : super(context, attrs, defStyleAttr)
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        Log.d("TAGGG", "onMeasure")
//
//        val sizeWidth = MeasureSpec.getSize(widthMeasureSpec)
//        val sizeHeight = MeasureSpec.getSize(heightMeasureSpec)
//
//        var customSizeHeight = 0
//        var customSizeWidth = 0
//
//        when (MeasureSpec.getMode(widthMeasureSpec)) {
//            MeasureSpec.EXACTLY -> {
//                customSizeWidth = sizeWidth
//                customSizeHeight = sizeHeight
//            }
//            MeasureSpec.AT_MOST -> {
//                customSizeWidth = sizeWidth * 8 / 10
//                customSizeHeight = sizeHeight
//            }
//            MeasureSpec.UNSPECIFIED -> {
//                Log.e("AAA", "UNSPECIFIED")
//            }
//        }
//        setMeasuredDimension(customSizeWidth, customSizeHeight)
//    }
//
//    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
//        super.onSizeChanged(w, h, oldw, oldh)
//        Log.d("TAGGG", "onSizeChanged")
//
//        cx = width / 2F
//        cy = height / 2F
//        radius = Math.min(width, height) / 2F
//        rectF.left = 0F
//        rectF.top = cy - radius
//        rectF.right = radius * 2
//        rectF.bottom = cy + radius
//    }
//
//    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)
//        Log.d("TAGGG", "onDraw")
//
//        canvas ?: return
//
//        canvas.drawArc(rectF, 270F, listOfAngles.get(0), true, arcPaint)
//        canvas.rotate(listOfAngles.get(0), cx, cy)
//        canvas.drawArc(rectF, 270F, listOfAngles.get(1), true, arcPaint2)
//        canvas.rotate(listOfAngles.get(1), cx, cy)
//        canvas.drawArc(rectF, 270F, listOfAngles.get(2), true, arcPaint3)
//    }
//}