package soap.example.services;

import org.springframework.stereotype.Service;
import soap.example.ws.calculator.Calculator;


import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class CalculadorServices {
    public Integer myService(){
        return calculatorSoapService()
                .getCalculatorSoap12()
                .add(5,6);
    }

    static final String URLSERVICES = "http://tempuri.org/";
    static final String LOCALPORT ="Calculator";

    private Calculator calculatorSoapService(){
        try {
            return new Calculator(new URL("classpath:wsdl/calculator.wsdl"), new QName(URLSERVICES,LOCALPORT));
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
