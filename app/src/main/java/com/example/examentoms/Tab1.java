package com.example.examentoms;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Tab1 extends Fragment  {

    Button button1;
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        // 3.- Propiedades vistas
        button1 = view.findViewById(R.id.button1);
        editText = view.findViewById(R.id.editText);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double raiz = Math.sqrt(Double.parseDouble(editText.getText().toString()));
                    button1.setText("" + raiz);
                } catch (Exception e) {
                    button1.setText("ERROR");
                }
            }
        });
        return view;
    }
}
