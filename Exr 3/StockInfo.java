package com.atelier3;

public class StockInfo {

    public static void main(String[] args){
        Information client1= new Information();
        Information client2 = new Information();

        client1.nom = "El Alami Hassan ";
        client1.adresse = "(Safi) ";
        client1.solde = 14765.8;

        client1.infoclient1();

        client2.nom = "Karimi Khalid ";
        client2.adresse = "(Casablanca) ";
        client2.solde = 7654.0;

        client2.infoclient1();



    }
   
    }

