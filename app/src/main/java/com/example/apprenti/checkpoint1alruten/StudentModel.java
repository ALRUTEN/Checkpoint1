package com.example.apprenti.checkpoint1alruten;

/**
 * Created by apprenti on 29/09/17.
 */

public class StudentModel {

    //Attributs privés.
    private String nom;
    private String prenom;
    private String ecole;
    private String langage;


    //Constructeur. constructeur de la classe public (StudentModel) avec ses arguments: Nom, Prénom, Ecole, Language.
    public StudentModel(String nom, String prenom, String ecole, String langage) {
        this.nom = nom;
        this.prenom = prenom;
        this.ecole = ecole;
        this.langage = langage;
    }

    //Getter
    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public String getEcole() {
        return ecole;
    }


    public String getLangage() {
        return langage;
    }

}

