package com.example.uts_10120092.viewpager;

/*
NIM     : 10120092
Nama    : Alfandi Khaerul Rahman
Kelas   : IF3
*/

import com.example.uts_10120092.R;

public enum ModelObject {

    PERKENALAN1(R.string.judul_1, R.layout.view_perkenalan1),
    PERKENALAN2(R.string.judul_2, R.layout.view_perkenalan2);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
