package com.example.plac;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Buttun extends androidx.appcompat.widget.AppCompatButton {
    public Buttun(Context context) {
        super(context);
        buld(context,null) ;
    }

    public Buttun(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        buld(context,attrs) ;
    }

    public Buttun(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        buld(context,attrs) ;
    }

    private void buld(Context context,AttributeSet attrs){
        setTypeface(fonts.getTypeface(context,"fonts/SOGAND.ttf"));
    }
}
