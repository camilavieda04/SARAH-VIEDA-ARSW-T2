package edu.eci.arsw.parcial2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Estadisticas del coronavirus
 */


public class Coronavirus {
    private String city;
    private String province;
    private String country;
    private String lastUpdate;
    private String keyId;
    private int confirmed;
    private int deaths;
    private int recovered;
    
    /**
     * Constructor
     */
    public Coronavirus(){
        
    }

    /**
     * 
     * @return la ciudad en la que hara el estudio 
     */

    public String getCity() {
        return city;
    }

    /**
     * Metodo que cambia la ciudad en la que hara el estudio 
     * @param city nueva ciudad a estudiar 
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return la provincia en la que hara el estudio 
     */

    public String getProvince() {
        return province;
    }

    /**
     * Metodo que cambia la provincia en la que hara el estudio 
     * @param province nueva provincia a estudiar 
     */

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 
     * @return el pais en la que hara el estudio 
     */
    public String getCountry() {
        return country;
    }

    /**
     * Metodo que cambia el pais en la que hara el estudio 
     * @param country nuevo pais a estudiar 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return el pais en la que hara el estudio 
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * 
     * @return el numero de confirmados 
     */

    public int getConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed numero de casos confirmados 
     * @return nuevo numero de casos confirmados
     */

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
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
        this.deaths = deaths;
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
        this.recovered = recovered;
    }

	



}