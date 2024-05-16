package com.microservice.bonanza;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class ServiceAController {

    @Get
    public String index() {
        return "Hello from Service A!";
    }
}
