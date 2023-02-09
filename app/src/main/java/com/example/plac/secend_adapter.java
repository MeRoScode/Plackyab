package com.example.plac;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class secend_adapter extends FragmentPagerAdapter {

    private Context context;

    public secend_adapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context ;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return khas.instense();
            case 1 :
                return ady.instense();
            default:
                return khas.instense();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "پلاک های خاص";
            case 1 :
                return "پلاک های عمومی";
            default:
                return "پلاک های خاص";
        }
    }
}
