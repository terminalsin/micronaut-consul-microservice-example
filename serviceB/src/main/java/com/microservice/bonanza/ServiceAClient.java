package com.microservice.bonanza;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

@Client(id = "servicea")
public interface ServiceAClient {

    @Get()
    Publisher<String> index();
}