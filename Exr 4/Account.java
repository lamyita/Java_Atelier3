package com.atelier3;

public class Account {

    String nom;
    String adresse;
    double solde;
    double interer;


   void afficherInfosSolde(){

        System.out.println( nom + "à " + adresse +"-infos solde "+ solde);

    }

    void calculerInterer(){
        System.out.println(nom + "à " + adresse +"-infos solde " +  (solde * interer));
    }
}
