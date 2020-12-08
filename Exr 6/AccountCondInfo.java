package com.atelier3;


public class AccountCondInfo {

    public static void main(String[] args) {
        AccountCond client = new AccountCond();

        client.nom = "El Alami Hassan ";
        client.adresse = "(Safi) ";
        client.solde = 14765.8;
        client.interer = 0.07;
        client.some = 123;



        client.setName("");
        System.out.println(client.getNom());


        System.out.println(client.getSolde() - client.getSome());

    }

}
