package com.example.uts_10120092.ui.crud;

/*
NIM     : 10120092
Nama    : Alfandi Khaerul Rahman
Kelas   : IF3
*/

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.uts_10120092.R;
import com.example.uts_10120092.helper.Helper;


public class EditorFragment extends Fragment {

    private EditText editJudul, editKategori, editIsi;
    private Button btnSave;
    private Helper db = new Helper(requireContext());
    private String id, judul, tanggal, kategori, isi;

    public EditorFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_editor, container, false);

        editJudul = view.findViewById(R.id.text_judul);
        editKategori = view.findViewById(R.id.text_kategori);
        editIsi = view.findViewById(R.id.text_isi);


        return view;
    }
}