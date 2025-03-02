package org.integrate.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component("ADO")
public class ADO {
    private String url;
    private String body;
    private HttpMethod httpMethod;
    private HttpHeaders httpHeaders;
    private HttpEntity<String> httpEntity;
    private String protocol;
    private String clientId;
    private String clientSecret;
    private String merchantKey;
    private String gType;
    private double amount;
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getMerchantKey() {
        return merchantKey ;
    }

    public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
    }

    public HttpEntity<String> getHttpEntity() {
        return httpEntity;
    }

    public void setHttpEntity(HttpEntity<String> httpEntity) {
        this.httpEntity = httpEntity;
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "ADO{url:"+url+",\nbody:"+body+",\nhttpMethod:"+httpMethod+",\nprotocol:"+protocol+",\nclientId:"+clientId+"," +
                        "\nclientSecret:"+clientSecret+",\nmerchantKey:"+merchantKey+"\nhttpEntity:"+httpEntity;
    }

}
