package org.integrate.gateway.factory;

import org.integrate.exceptions.InvalidGateway;
import org.integrate.gateway.Gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GatewayFactory {
    ApplicationContext applicationContext;

    @Autowired
    public GatewayFactory(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    public Gateway getGateway(String gatewayType){
        try{
           return applicationContext.getBean(gatewayType, Gateway.class);
        }catch(Exception e){
            throw new InvalidGateway("Gateway Not Available");
        }
    }
}
