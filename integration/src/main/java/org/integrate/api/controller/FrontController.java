package org.integrate.api.controller;

import org.integrate.api.ADO;
import org.integrate.gateway.MRequest;
import org.integrate.gateway.factory.RequestFactory;
import org.integrate.gateway.services.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/integrate")
public class FrontController {

    @Autowired
    private ADO ado;

    @Autowired
    GatewayService gService;
    @Autowired
    RequestFactory reqFactory;

    @PostMapping("/payout")
    public ResponseEntity<Object> payout(@RequestBody MRequest mRequest){
        ado.setgType(mRequest.getgType());
        ado.setAmount(mRequest.getAmount());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(gService.processGatewayPayemt(mRequest.getgType(), ado));
    }
}



