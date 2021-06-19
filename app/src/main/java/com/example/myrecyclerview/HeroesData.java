package com.example.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"SyifaViranda", "Terakhir login 2 jam yang lalu", String.valueOf(R.drawable.foto1)},
            {"AdiraTiktok", "Terakhir login 2 April 2021", String.valueOf(R.drawable.foto2)},
            {"AlanaWulandari", "Terakhir login 3 April 2021", String.valueOf(R.drawable.foto3)},
            {"AdiraSahara", "Terakhir login 4 April 2021", String.valueOf(R.drawable.foto4)}
    };
 
    public static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}