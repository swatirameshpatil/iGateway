package org.integrate.gateway.paytm;

import org.integrate.api.ADO;
import org.integrate.builder.IntegrationBuilder;
import org.integrate.gateway.Gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Paytm")
public class PaytemIntegrator implements Gateway {

    @Autowired
    private IntegrationBuilder integrator;

    @Override
    public Object processPayment(ADO ado) {

        //return integrator.buildIntegration(ado);
        return "Paytm Payment processed successfully";
    }
}
