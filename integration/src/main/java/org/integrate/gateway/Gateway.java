package org.integrate.gateway;

import org.integrate.api.ADO;
import org.integrate.builder.IntegrationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface Gateway {

public Object processPayment(ADO ado);

}
