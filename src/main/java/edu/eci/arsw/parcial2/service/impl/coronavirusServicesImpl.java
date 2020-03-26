package edu.eci.arsw.parcial2.service.impl;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.arsw.parcial2.model.Coronavirus;
import edu.eci.arsw.parcial2.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.arsw.parcial2.service.coronavirusServices;
import java.util.*;

@Service
public class coronavirusServicesImpl implements coronavirusServices {

    @Autowired
    HttpConnectionImpl hc;

    @Override
    public List<Pais> getAllCases() throws UnirestException {
        return null;
        
    }

	@Override
	public List<Pais> getPais(String pais) throws UnirestException {
	
		return null;
    }
}

    
