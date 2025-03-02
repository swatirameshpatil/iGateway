package org.integrate.gateway.factory;

import org.integrate.exceptions.InvalidGateway;
import org.integrate.gateway.IRequest;
import org.integrate.gateway.IResponse;
import org.integrate.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class ResponseFactory {
    @Autowired
    ApplicationContext applicationContext;

    public ResponseFactory(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    public IResponse getGatewayResponse(String gType){
        try{
            String beanNm = gType.concat(Constants.RESPONSE);
            return applicationContext.getBean(beanNm, IResponse.class);
        }catch(Exception e){
            throw new InvalidGateway("Gateway Not Available");
        }
    }
}
