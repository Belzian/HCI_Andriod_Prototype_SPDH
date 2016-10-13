package com.example.belzi.hciprototype;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FavouritesTab extends Fragment {
    private SharedPreferences preferences;
    private List favourites = new ArrayList();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_favourites_tab, container, false);

    }

    public void addFavourites(View view){
        String category = "";

        switch (view.getId()){
            case R.id.proteinFav:
                category = "protein";

                break;

        }

        preferences.edit().putString("favourites", category).apply();
    }

}
