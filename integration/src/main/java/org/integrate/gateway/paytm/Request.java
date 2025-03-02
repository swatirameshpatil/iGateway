package org.integrate.gateway.paytm;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.integrate.gateway.IRequest;
import org.integrate.gateway.phonepe.PaymentInstrumentType;
import org.integrate.gateway.phonepe.RedirectMode;
import org.springframework.stereotype.Component;

@Component("PaytmRequest")
public class Request implements IRequest {
    private String merchantId;
    private String merchantTransactionId;
    private long amount;
    private String merchantUserId;
    private String redirectUrl;
    private RedirectMode redirectMode;
    private String callbackUrl;
    private Object paymentInstrument;
    private PaymentInstrumentType paymentInstrument_type;
    private String mobileNumber;

    public Request(){

    }
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantTransactionId() {
        return merchantTransactionId;
    }

    public void setMerchantTransactionId(String merchantTransactionId) {
        this.merchantTransactionId = merchantTransactionId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public RedirectMode getRedirectMode() {
        return redirectMode;
    }

    public void setRedirectMode(RedirectMode redirectMode) {
        this.redirectMode = redirectMode;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Object getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setPaymentInstrument(Object paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public PaymentInstrumentType getPaymentInstrument_type() {
        return paymentInstrument_type;
    }

    public void setPaymentInstrument_type(PaymentInstrumentType paymentInstrument_type) {
        this.paymentInstrument_type = paymentInstrument_type;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString(){
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (Exception e) {
            return "Error converting to JSON: " + e.getMessage();
        }
    }
}
