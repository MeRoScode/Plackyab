package com.example.plac.View;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

public class Textveiev extends androidx.appcompat.widget.AppCompatTextView {
    public Textveiev(Context context) {
        super(context);
        buld(context,null) ;
    }

    public Textveiev(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        buld(context,attrs) ;
    }

    public Textveiev(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        buld(context,attrs) ;
    }

    private void buld(Context context,AttributeSet attrs){
        setTypeface(fonts.getTypeface(context,"fonts/1_5186154794963697720.ttf"));
    }
}
