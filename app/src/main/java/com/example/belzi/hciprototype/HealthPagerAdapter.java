package com.example.belzi.hciprototype;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
/**
 * Created by Shaquille on 13/10/2016.
 */

public class HealthPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public HealthPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                OverallTab tab1 = new OverallTab();
                return tab1;
            case 1:
                CategoriesTab tab2 = new CategoriesTab();
                return tab2;
            case 2:
                FavouritesTab tab3 = new FavouritesTab();
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