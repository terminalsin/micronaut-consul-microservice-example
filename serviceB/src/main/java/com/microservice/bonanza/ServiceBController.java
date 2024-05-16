package com.microservice.bonanza;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import org.reactivestreams.Publisher;

@Controller
public class ServiceBController {

    @Get
    public String index() {
        return "Hello from Service B!";
    }

    @Inject
    private ServiceAClient serviceAClient;

    @Get(value = "/serviceA", produces = "text/plain")
    public Publisher<String> serviceA() {
        return serviceAClient.index();
    }
}
