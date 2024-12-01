package com.mobileapp.navigationdrawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addnotes extends Fragment {

    public Addnotes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_addnotes, container, false);
//        EditText title = view.findViewById(R.id.title);
//        EditText description = view.findViewById(R.id.description);
//        Button save = view.findViewById(R.id.save);
//
//        DBManager db = new DBManager(getContext());

//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String titleDB = title.getText().toString().trim();
//                String descriptionDB = description.getText().toString().trim();
//
//
//                boolean result = db.addNotes(titleDB, descriptionDB);
//
//                if (result) {
//                    Toast.makeText(requireContext(), "Data Successfully Inserted", Toast.LENGTH_SHORT).show();
//                    title.setText("");
//                    description.setText("");
//                } else {
//                    Toast.makeText(requireContext(), "Something Went Wrong", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        return view;
    }

}