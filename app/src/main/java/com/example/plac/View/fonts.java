package com.example.plac.View;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class fonts {

    private static final HashMap<String, Typeface> typefaceCashe = new HashMap<>();

    public static Typeface getTypeface(Context context,String path) {
        if (!typefaceCashe.containsKey(path)){
            Typeface typeface = Typeface.createFromAsset(context.getAssets(),path);
            typefaceCashe.put(path,typeface);
        }
        return typefaceCashe.get(path);
    }
}
