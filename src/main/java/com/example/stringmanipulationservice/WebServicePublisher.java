package com.example.stringmanipulationservice;

import com.example.stringmanipulationservice.StringManipulationServiceImpl;
import javax.xml.ws.Endpoint;

public class WebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/string-manipulation-service/StringManipulationService",
                new StringManipulationServiceImpl());
        System.out.println("StringManipulationService is published!");
    }
}