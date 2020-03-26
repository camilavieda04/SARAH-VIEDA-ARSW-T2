package edu.eci.arsw.parcial2.controller;

import edu.eci.arsw.parcial2.model.Pais;
import edu.eci.arsw.parcial2.service.impl.coronavirusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
@RestController
@RequestMapping(value="/covid19")
public class coronavirusController {
    @Autowired 
    coronavirusServiceImpl cs;
    /**
     * Retorna una lista de todos los casos de coronavirus
     * @return ResponseEntity con el codigo http
     */

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllCases(){
        try{
            return new ResponseEntity<>(cs.getAllCases(),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(coronavirusController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Retorna el pais con sus casos de coronavirus
     * @param pais nombre del país que se desea consultar
     * @return ResponseEntity con el codigo http 
     */


    @RequestMapping(path="/{pais}",method = RequestMethod.GET)
    public ResponseEntity<?> getCoronaPais(@PathVariable("pais") String pais){
        try{
            return new ResponseEntity<>( cs.getCoronaPais(pais),HttpStatus.ACCEPTED);

        }catch(Exception ex){
            Logger.getLogger(coronavirusController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }

    }
}





