package edu.eci.arsw.parcial2.service.impl;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.eci.arsw.parcial2.model.Coronavirus;
import edu.eci.arsw.parcial2.model.Pais;
import edu.eci.arsw.parcial2.service.coronavirusServices;
import edu.eci.arsw.parcial2.service.impl.*;

@Service
public class coronavirusServiceImpl implements coronavirusServices {
    @Autowired
    HttpConnectionImpl hcs;
    
    @Override
    public List<Pais> getAllCases() throws UnirestException {
        List<Coronavirus> paises = hcs.getAllCases();
        HashMap<String, ArrayList<Integer>> countries = new HashMap<String, ArrayList<Integer>>();
        for (Coronavirus pa:paises){
            if (countries.containsKey(pa.getCountry())){
                ArrayList<Integer> aux = new ArrayList<Integer>();
                ArrayList<Integer> temporal = countries.get(pa.getCountry());
                countries.remove(pa.getCountry());
                aux.add(temporal.get(0)+pa.getDeaths());aux.add(temporal.get(1)+pa.getConfirmed());aux.add(temporal.get(2)+pa.getRecovered());
                countries.put(pa.getCountry(),aux); 
            }
            else{
                ArrayList<Integer> temporal = new ArrayList<Integer>();
                temporal.add(pa.getDeaths());temporal.add(pa.getConfirmed());temporal.add(pa.getRecovered());
                countries.put(pa.getCountry(),temporal);
            }
            
        }
        List<Pais> objetos = new ArrayList<Pais>();
        for (HashMap.Entry<String, ArrayList<Integer>> entry : countries.entrySet()) {
            objetos.add(new Pais(entry.getKey(),entry.getValue().get(0),entry.getValue().get(1),entry.getValue().get(2)));
        }

        return objetos;
    }
    

    @Override
    public List<Pais> getCoronaPais(String pais) throws UnirestException {
        // TODO Auto-generated method stub
        return null;
    }

    

}