package org.integrate.exceptions;

public class InvalidGateway extends RuntimeException{
    public InvalidGateway(String errMsg){
        super(errMsg);
    }
}
