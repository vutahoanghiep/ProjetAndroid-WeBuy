package com.example.vutahoanghiep.webuy.magasin;

/**
 * Created by TaHoangHiep on 21/02/2018.
 */

public class Magasin {
    private String nomLogo;
    private String nomMagasin;
    private String adresseMagasin;
    private int nombrePromos;

    public Magasin(String nomLogo, String nomMagasin, String adresseMagasin, int nombrePromos) {
        this.nomLogo = nomLogo;
        this.nomMagasin = nomMagasin;
        this.adresseMagasin = adresseMagasin;
        this.nombrePromos = nombrePromos;
    }

    public String getNomLogo() {
        return nomLogo;
    }

    public void setNomLogo(String nomLogo) {
        this.nomLogo = nomLogo;
    }

    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }

    public String getAdresseMagasin() {
        return adresseMagasin;
    }

    public void setAdresseMagasin(String adresseMagasin) {
        this.adresseMagasin = adresseMagasin;
    }

    public int getNombrePromos() {
        return nombrePromos;
    }

    public void setNombrePromos(int nombrePromos) {
        this.nombrePromos = nombrePromos;
    }
}
