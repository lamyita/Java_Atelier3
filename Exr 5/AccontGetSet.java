package com.atelier3;

public class AccontGetSet {
   public static void main(String[] args){
       AccountGeSe  client = new AccountGeSe ();

       client.nom = "El Alami Hassan ";
       client.adresse = "(Safi) ";
       client.solde = 14765.8;
       client.interer = 0.07;

       client.setNom("Mohemad");
       System.out.println(client.getNom());

       System.out.println(client.getAdresse());
       System.out.println(client.getSolde());


    }





}
