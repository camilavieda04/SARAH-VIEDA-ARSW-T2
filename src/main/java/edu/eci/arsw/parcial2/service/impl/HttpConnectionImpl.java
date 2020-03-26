package edu.eci.arsw.parcial2.service.impl;

import edu.eci.arsw.parcial2.model.Coronavirus;
import edu.eci.arsw.parcial2.model.Pais;
import edu.eci.arsw.parcial2.service.conectionServices;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@Service
public class HttpConnectionImpl implements conectionServices {
    @Override
    public List<Pais> getAllCases() throws UnirestException {
        Gson gson = new GsonBuilder().create();
        List<Pais> resp = null;
        HttpResponse<JsonNode> response = null;
        try {
            response = Unirest
                    .get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats")
                    .header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
                    .header("x-rapidapi-key", "f0ac279634mshfb892495e463495p1334bajsn9a3c972b3eaa")
                    .asJson();
        } catch (UnirestException ex) {
            Logger.getLogger(HttpConnectionImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
        JSONArray statics = response.getBody().getObject().getJSONObject("data").getJSONArray("covid19Stats");
        resp = gson.fromJson(statics.toString(),new TypeToken<List<Pais>>(){}.getType());
        return resp;
    }

    @Override
    public List<Pais> getPais(String pais) throws UnirestException {
        Gson gson = new GsonBuilder().create();
        List<Pais> resp = null;
        HttpResponse<JsonNode> response = null;
        try {
            response = Unirest
                    .get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country="+pais)
                    .header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
                    .header("x-rapidapi-key", "f0ac279634mshfb892495e463495p1334bajsn9a3c972b3eaa")
                    .asJson();
        } catch (UnirestException ex) {
            Logger.getLogger(HttpConnectionImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
        JSONArray statics = response.getBody().getObject().getJSONObject("data").getJSONArray("covid19Stats");
        resp = gson.fromJson(statics.toString(), new TypeToken<List<Pais>>(){}.getType());
        return resp;
    }

    

}