package com.example.plac;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Main_Adapter extends FragmentPagerAdapter {

    private Context context;

    public Main_Adapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context ;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1 :
                return Speciall_Placks.instense();
            default:
                return Normal_Placks.instense();
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
            case 1 :
                return "پلاک های خاص";
            default:
                return "پلاک های عمومی";
        }
    }
}
