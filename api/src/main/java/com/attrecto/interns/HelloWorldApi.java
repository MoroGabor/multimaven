package com.attrecto.interns;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping(value = "/api/hello")
public interface HelloWorldApi {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    Set<HelloWorld> hello();

}
