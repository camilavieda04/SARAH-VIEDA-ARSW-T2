package edu.eci.arsw.parcial2.controller;

import edu.eci.arsw.parcial2.service.impl.coronavirusServicesImpl;
import edu.eci.arsw.parcial2.model.Pais;
import edu.eci.arsw.parcial2.service.coronavirusServices;
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
    coronavirusServicesImpl cs;
    /**
     * Retorna una lista de todos los casos de coronavirus
     * @return ResponseEntity con el codigo http
     */

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllCases(){
        List<Pais> dataTodo= null;
        try{
            dataTodo= cs.getAllCases();
            return new ResponseEntity<>(dataTodo,HttpStatus.ACCEPTED);
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
    public ResponseEntity<?> getPais(@PathVariable("pais") String pais){
        List<Pais> dataPais= null;
        try{
            dataPais= cs.getPais(pais);
            return new ResponseEntity<>(dataPais,HttpStatus.ACCEPTED);

        }catch(Exception ex){
            Logger.getLogger(coronavirusController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }

    }
}





