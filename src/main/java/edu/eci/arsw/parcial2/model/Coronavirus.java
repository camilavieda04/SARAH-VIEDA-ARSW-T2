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
     * Metodo que cambia la ciudad en la que hara el estudio 
     * @param city nueva ciudad a estudiar 
     */

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

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

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

	



}