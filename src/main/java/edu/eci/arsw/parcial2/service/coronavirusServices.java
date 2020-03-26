package edu.eci.arsw.parcial2.service;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.parcial2.model.Pais;
import org.json.JSONArray;
import java.util.List;

public interface coronavirusServices {
    List<Pais> getAllCases() throws UnirestException;   
    List<Pais> getPais(String pais) throws UnirestException;

}