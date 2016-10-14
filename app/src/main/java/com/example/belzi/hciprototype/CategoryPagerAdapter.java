package com.example.belzi.hciprototype;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public CategoryPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ValuesTab tab1 = new ValuesTab();
                return tab1;
            case 1:
                BarChartTab tab2 = new BarChartTab();
                return tab2;
            case 2:
                LineChartTab tab3 = new LineChartTab();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}