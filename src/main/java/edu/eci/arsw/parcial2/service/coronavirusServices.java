package edu.eci.arsw.parcial2.service;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.ArrayList;
import java.util.HashMap;
import edu.eci.arsw.parcial2.model.Coronavirus;
import edu.eci.arsw.parcial2.model.Pais;

import org.json.JSONArray;
import java.util.List;

public interface coronavirusServices {
    List<Pais> getAllCases() throws UnirestException;   
    List<Pais> getCoronaPais(String pais) throws UnirestException;

}