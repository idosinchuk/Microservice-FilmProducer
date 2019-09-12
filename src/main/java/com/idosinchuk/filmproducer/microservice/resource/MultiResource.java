package com.idosinchuk.filmproducer.microservice.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class MultiResource extends ResourceSupport {
    private final String content;

    @JsonCreator
    public MultiResource(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}