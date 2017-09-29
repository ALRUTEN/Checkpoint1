package com.example.apprenti.checkpoint1alruten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button envoyer;
    EditText language;
    EditText nom;
    EditText prenom;
    EditText ecole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        envoyer  = (Button) findViewById(R.id.button);
        language  = (EditText) findViewById(R.id.language);
        prenom  = (EditText) findViewById(R.id.prenom);
        nom  = (EditText) findViewById(R.id.nom);
        ecole  = (EditText) findViewById(R.id.ecole);
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (language.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Merci de renseigner tous les champs du formulaire",Toast.LENGTH_LONG).show();
                }
                else{
                    StudentModel studentModel = new StudentModel("nom","prenom","ecole","language");

                    Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                    intent.putExtra("nom", nom.getText().toString());
                    intent.putExtra("prenom", prenom.getText().toString());
                    intent.putExtra("ecole", ecole.getText().toString());
                    intent.putExtra("language", language.getText().toString());

                    startActivity(intent);
                }
            }
        });

    }
}