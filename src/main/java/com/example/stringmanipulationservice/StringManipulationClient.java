package com.example.stringmanipulationservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import com.example.stringmanipulationservice.StringManipulationService;

public class StringManipulationClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/string-manipulation-service/StringManipulationService?wsdl");
        QName qname = new QName("http://stringmanipulationservice.example.com/", "StringManipulationService");

        Service service = Service.create(url, qname);
        StringManipulationService sms = service.getPort(StringManipulationService.class);

        // Test reverseText operation
        String originalText = "hello";
        String reversedText = sms.reverseText(originalText);
        System.out.println("reverseText(\"" + originalText + "\") = \"" + reversedText + "\"");

        // Test countCharacters operation
        String textToCount = "hello world";
        int charCount = sms.countCharacters(textToCount);
        System.out.println("countCharacters(\"" + textToCount + "\") = " + charCount);
    }
}