package com.example.uts_10120092.ui.home;

/*
NIM     : 10120092
Nama    : Alfandi Khaerul Rahman
Kelas   : IF3
*/

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("SELAMAT DATANG DI APLIKASI CATATAN, KLIK ICON KIRI TATAS UNTUK MELIHAT OPSI");
    }

    public LiveData<String> getText() {
        return mText;
    }
}