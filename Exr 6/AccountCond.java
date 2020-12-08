package com.atelier3;

public class AccountCond {

    String nom;
    String adresse;
    double solde;
    double interer;
    double some;

    public String getNom() {
        return nom;
    }

    public void setName(String name) {
        if(!name.equals("")){
            nom = name;
        }
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public double getSome() {
        return some;
    }

    public double retirer(double some){
        if (some <= solde) {
            setSolde(solde - some);
            return  some;
        } else return  0.0;

    }
}
