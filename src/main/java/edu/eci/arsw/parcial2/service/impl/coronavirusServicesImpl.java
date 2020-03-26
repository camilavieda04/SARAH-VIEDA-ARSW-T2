import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.parcial2.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.arsw.parcial2.service.coronavirusServices;
import java.util.*;
import java.util.concurrent.TimeUnit;
@Service
public class coronavirusServicesImpl implements coronavirusServices {

    @Override
    public List<Pais> getAllCases() throws UnirestException {
        return null;
    }
}