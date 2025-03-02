package org.integrate.utils;

import org.integrate.gateway.IRequest;

import java.util.Base64;

public class Utils {

    public static String getEncodedBase64(IRequest request){
        if(request == null){
            throw new IllegalArgumentException("Request Is Empty!!");
        }
        return Base64.getEncoder().encodeToString(request.toString().getBytes());
    }

    public static String getDecodedBase64(String base64Request){
        if(base64Request == null){
            throw new IllegalArgumentException("Encoded Message Is Empty!!");
        }
        return new String(Base64.getDecoder().decode(base64Request));
    }

}
