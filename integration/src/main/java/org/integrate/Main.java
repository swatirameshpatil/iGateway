package org.integrate;

import org.integrate.gateway.IRequest;
import org.integrate.gateway.IResponse;
import org.integrate.gateway.phonepe.Request;
import org.integrate.gateway.phonepe.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        IRequest request = new Request();

        System.out.println("Request is: "+request);

        IResponse response = new Response();
        System.out.println("Response is: "+response);
    }
}