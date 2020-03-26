package edu.eci.arsw.parcial2.model;
/**
 * Estadisticas del Coronavirus
 */


public class Coronavirus{


    private String name;
    private int Numconfirm;
    private int Numdeaths;
    private int Numrecovered;

    public Coronavirus(String name,int Numconfirm,int Numdeaths,int Numrecovered){
        this.name=name;
        this.Numconfirm=Numconfirm;
        this.Numdeaths=Numdeaths;
        this.Numrecovered=Numrecovered;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }

    public void setNumconfirm(int Numconfirm) {
        Numconfirm = Numconfirm;
    }

    public int getNumdeaths() {
        return Numdeaths;
    }

    public void setNumdeaths(int numdeaths) {
        Numdeaths = numdeaths;
    }

    public int getNumrecovered() {
        return Numrecovered;
    }

    public void setNumrecovered(int Numrecovered) {
        Numrecovered = Numrecovered;
    }

    @Override
    public String toString() {
        return "Corona Virus{" + "name=" + name + ", NumConfirm=" + Numconfirm + ", NumDeaths=" + Numdeaths + ", NumRecovered=" + Numrecovered +'}';
    }
}