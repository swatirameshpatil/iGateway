package org.integrate.gateway.factory;

import org.integrate.exceptions.InvalidGateway;
import org.integrate.gateway.Gateway;
import org.integrate.gateway.IRequest;
import org.integrate.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RequestFactory {
    @Autowired
    private ApplicationContext applicationContext;

    public RequestFactory(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    public IRequest getGatewayRequest(String gType){
        try{
            String beanNm = gType.concat(Constants.REQUEST);
            return applicationContext.getBean(gType, IRequest.class);
        }catch(Exception e){
            throw new InvalidGateway("Gateway Not Available");
        }
    }

}
