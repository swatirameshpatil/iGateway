package org.integrate.builder;

import org.integrate.api.ADO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Component
public class IntegrationBuilderImpl implements IntegrationBuilder{

    @Override
    public Object buildIntegration(ADO ado) {
        RestTemplate rTemplate = new RestTemplate();
        return rTemplate.exchange(ado.getUrl(), ado.getHttpMethod(), ado.getHttpEntity() , ResponseBody.class);
    }
}
