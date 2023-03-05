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

    @Autowired
    CountryInfoService countryInfoService;

    public List<TCountryInfo> myService(){
        return countryInfoService
                .getCountryInfoServiceSoap()
                .fullCountryInfoAllCountries()
                .getTCountryInfo();
    }


}
