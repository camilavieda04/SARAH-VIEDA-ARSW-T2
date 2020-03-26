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

    /**
     * 
     * @return el nombre del pais
     */

    public String getName() {
        return name;
    }

    /**
     * @param name del pais 
     * @return nuevo pais a estudiar 
     */
    public void setName(String name) {
        name = name;
    }

    /**
     * 
     * @return el numero de confirmados 
     */
    public int getConfirmed(){
        return confirmed;
    }

    /**
     * @param confirmed numero de casos confirmados 
     * @return nuevo numero de casos confirmados
     */
    public void setConfirmed(int confirmed) {
        confirmed = confirmed;
    }

    /**
     * 
     * @return el numero de casos de muerte
     */

    public int getDeaths() {
        return deaths;
    }
    /**
     * @param deaths numero de casos de muerte
     * @return nuevo numero de casos de muerte
     */

    public void setDeaths(int deaths) {
        deaths = deaths;
    }
     /**
     * 
     * @return el numero de casos que se han recuperado
     */
    public int getRecovered() {
        return recovered;
    }
    /**
     * @param recovered numero de casos que se han recuperado
     * @return nuevo numero de casos recuperados
     */
    public void setRecovered(int recovered) {
        recovered = recovered;
    }

    @Override
    public String toString() {
        return "Corona Virus{" + "name=" + name + ", NumConfirm=" + confirmed + ", NumDeaths=" + deaths + ", NumRecovered=" + recovered +'}';
    }
}