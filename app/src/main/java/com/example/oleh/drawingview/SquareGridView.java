package com.example.oleh.drawingview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/**
 * Created by Oleh on 27.01.2018.
 */

public class SquareGridView extends View {
    public static final String TAG = SquareGridView.class.getName();
    Paint ballPaint;
    public SquareGridView(Context context) {
        super(context);
        ballPaint = new Paint();
        ballPaint.setAntiAlias(true);
        ballPaint.setColor(Color.BLUE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG, "onDraw: ");
        canvas.drawCircle(50,50,100,ballPaint);
    }
}
