package edu.eci.arsw.parcial2.controller;
import edu.eci.arsw.parcial2.service.impl.coronavirusServicesImpl;
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
@RestController
@RequestMapping(value="/covid19")
public class coronavirusController {
    @Autowired 
    coronavirusServicesImpl cs = null;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllCases(){
        try{
            return new ResponseEntity<>(cs.getAllCases(),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(coronavirusController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}





