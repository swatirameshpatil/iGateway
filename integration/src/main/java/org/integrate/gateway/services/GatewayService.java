package org.integrate.gateway.services;

import org.integrate.api.ADO;
import org.integrate.gateway.factory.GatewayFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatewayService {

    private final GatewayFactory gFactory;

    @Autowired
    public GatewayService(GatewayFactory gFactory){
        this.gFactory = gFactory;
    }

    public Object processGatewayPayemt(String gType, ADO ado){
       return gFactory.getGateway(gType).processPayment(ado);
    }


}
