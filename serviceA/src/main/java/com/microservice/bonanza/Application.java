package com.microservice.bonanza;

import io.micronaut.runtime.Micronaut;

import static io.micronaut.context.env.Environment.DEVELOPMENT;

public class Application {

    public static void main(String[] args) {
        Micronaut.build(args)
                .mainClass(Application.class)
                .defaultEnvironments(DEVELOPMENT)
                .start();
    }
}