package edu.eci.arsw.parcial2.model;
/**
 * Estadisticas del Coronavirus
 */


public class Coronavirus{


    private String city;
    private String province;
    private String country;
    private int Numinfected;
    private int Numdeaths;
    private int Numcured;

    /**
     * 
     * @return city donde se esta haciendo la estadistica
     */

    public String getCity() {
        return city;
    }

    /**
     * Cambia la ciudad donde se esta haciendo la estadistica
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public String toString() {
        return "Corona Virus{" + "city=" + city + ", province=" + province + ", country=" + country + ", NumInfected=" + Numinfected + ", NumDeaths=" + Numdeaths + ", NumCured=" + Numcured +'}';
    }
}