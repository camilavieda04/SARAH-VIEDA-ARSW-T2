package edu.eci.arsw.parcial2.model;

public class Pais{

    private String name;
    private int confirmed;
    private int deaths;
    private int recovered;

    public Pais(String name,int confirmed,int deaths,int recovered){
        this.name=name;
        this.confirmed=confirmed;
        this.deaths=deaths;
        this.recovered=recovered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public void setConfirmed(int confirmed) {
        confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        recovered = recovered;
    }

    @Override
    public String toString() {
        return "Corona Virus{" + "name=" + name + ", NumConfirm=" + confirmed + ", NumDeaths=" + deaths + ", NumRecovered=" + recovered +'}';
    }
}