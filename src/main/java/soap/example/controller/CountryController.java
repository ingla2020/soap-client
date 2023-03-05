package soap.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soap.example.services.CalculadorServices;
import soap.example.services.ContryServices;
import soap.example.ws.country.TCountryInfo;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    ContryServices contryServices;

    @Autowired
    CalculadorServices calculadorServices;

    @GetMapping("all")
    public List<TCountryInfo> getAll(){
        return contryServices.myService();
    }

    @GetMapping("add")
    public Integer getAdd(){
        return calculadorServices.myService();
    }
}
