package com.atelier3;

public class NousServir {
    public static void main(String[] args) {

        Account clientone = new Account();
        Account clienttwo = new Account();

        clientone.nom = "El Alami Hassan ";
        clientone.adresse = "(Safi) ";
        clientone.solde = 14765.8;
        clientone.interer = 0.07;

        clientone.afficherInfosSolde();
        clientone.calculerInterer();

        clienttwo.nom = "Karimi Khalid ";
        clienttwo.adresse = "(Casablanca) ";
        clienttwo.solde = 7654.0;
        clienttwo.interer = 0.07;

        clienttwo.afficherInfosSolde();
        clienttwo.calculerInterer();


    }
}
