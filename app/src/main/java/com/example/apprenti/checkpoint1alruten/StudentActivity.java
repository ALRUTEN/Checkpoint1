package com.example.apprenti.checkpoint1alruten;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        String nom = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");
        String ecole = getIntent().getStringExtra("ecole");
        String language = getIntent().getStringExtra("language");
        TextView result = (TextView) findViewById(R.id.textView);
        //Ajouter le contenu des string dans les champs de texte



    }


}
