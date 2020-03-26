package edu.eci.arsw.parcial2.service;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.arsw.parcial2.model.Coronavirus;
import edu.eci.arsw.parcial2.model.Pais;
import org.json.JSONArray;
import java.util.List;

public interface conectionServices {
    List<Coronavirus> getAllCases() throws UnirestException;   
    List<Coronavirus> getCoronaPais(String pais) throws UnirestException;

}