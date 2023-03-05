package soap.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soap.example.ws.calculator.Calculator;


import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class CalculadorServices {

    @Autowired
    Calculator calculatorSoapService;
    public Integer myService(){
        return calculatorSoapService
                .getCalculatorSoap12()
                .add(5,6);
    }


}
