package edu.eci.arsw.parcial2.model;

public class Pais {
    private String name;
    private int Numinfected;
    private int Numdeaths;
    private int Numcured;
    

    public Pais(String name){
        this.name=name;
        this.Numinfected=0;
        this.Numdeaths=0;
        this.Numcured=0;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNuminfected() {
        return Numinfected;
    }

    public void setNuminfected(int numinfected) {
        Numinfected = numinfected;
    }

    public int getNumdeaths() {
        return Numdeaths;
    }

    public void setNumdeaths(int numdeaths) {
        Numdeaths = numdeaths;
    }

    public int getNumcured() {
        return Numcured;
    }

    public void setNumcured(int numcured) {
        Numcured = numcured;
    }
}