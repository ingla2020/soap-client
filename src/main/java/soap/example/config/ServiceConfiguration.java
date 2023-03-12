package soap.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soap.example.ws.country.CountryInfoService;


import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

//@Configuration
public class ServiceConfiguration {

    static final String URLSERVICES = "http://www.oorsprong.org/websamples.countryinfo";
    static final String LOCALPORT ="CountryInfoService";

    //@Bean
    public CountryInfoService countryInfoService(){
        try {
            return new CountryInfoService(new URL("classpath:wsdl/country.wsdl"), new QName(URLSERVICES,LOCALPORT));
        } catch (MalformedURLException e) {
        }
        return null;
    }

}

