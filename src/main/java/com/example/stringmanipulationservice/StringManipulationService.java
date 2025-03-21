package com.example.stringmanipulationservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface StringManipulationService {

    @WebMethod
    String reverseText(@WebParam(name = "text") String text);

    @WebMethod
    int countCharacters(@WebParam(name = "text") String text);
}