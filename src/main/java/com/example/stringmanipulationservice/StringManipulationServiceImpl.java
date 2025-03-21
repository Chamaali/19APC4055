package com.example.stringmanipulationservice;

import com.example.stringmanipulationservice.StringManipulationService;
import javax.jws.WebService;

@WebService(endpointInterface = "com.example.service.StringManipulationService",
        serviceName = "StringManipulationService")
public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(String text) {
        if (text == null) {
            return "";
        }
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}