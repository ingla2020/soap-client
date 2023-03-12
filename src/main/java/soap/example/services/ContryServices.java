package soap.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soap.example.ws.country.CountryInfoService;
import soap.example.ws.country.TCountryInfo;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class ContryServices {

    public List<TCountryInfo> myService(){
        CountryInfoService countryInfoService = countryInfoService();
        return countryInfoService
                .getCountryInfoServiceSoap()
                .fullCountryInfoAllCountries()
                .getTCountryInfo();
    }


    static final String URLSERVICES = "http://www.oorsprong.org/websamples.countryinfo";
    static final String LOCALPORT ="CountryInfoService";

    public CountryInfoService countryInfoService(){
        try {
            return new CountryInfoService(new URL("classpath:wsdl/country.wsdl"), new QName(URLSERVICES,LOCALPORT));
        } catch (MalformedURLException e) {
        }
        return null;
    }

}
