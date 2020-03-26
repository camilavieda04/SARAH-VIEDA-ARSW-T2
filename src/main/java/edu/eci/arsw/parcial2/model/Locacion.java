package edu.eci.arsw.parcial2.model;
public class Locacion {
    private Double longitud;
    private Double latitud;

    /**
     * 
     * @return longitud del país
     */
    public Double getLongitud() {
        return longitud;
    }
    /**
     * 
     * @param longitud nueva longitud de un país 
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
    /**
     * 
     * @return latitud del país
     */
    public Double getLatitud() {
        return latitud;
    }
    /**
     * 
     * @param latitud nueva latitud de un país 
     */
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }
}
