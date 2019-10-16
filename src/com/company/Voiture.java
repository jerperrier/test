package com.company;

public class Voiture {
    int nbpneu;
    String modele;
    int nbChevaux;

    public Voiture(int nbpneu, String modele, int nbChevaux) {
        this.nbpneu = nbpneu;
        this.modele = modele;
        this.nbChevaux = nbChevaux;
    }

    public int getNbpneu() {
        return nbpneu;
    }

    public void setNbpneu(int nbpneu) {
        this.nbpneu = nbpneu;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNbChevaux() {
        return nbChevaux;
    }

    public void setNbChevaux(int nbChevaux) {
        this.nbChevaux = nbChevaux;
    }

    public void test(){}

    @Override
    public String toString() {
        return super.toString();
    }



}

