package soap.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soap.example.ws.calculator.Calculator;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

//@Configuration
public class CalculatorConfiguration {
    static final String URLSERVICES = "http://tempuri.org/";
    static final String LOCALPORT ="Calculator";

    //@Bean
    public Calculator calculatorSoapService(){
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

