package com.attrecto.interns;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequiredArgsConstructor
public class HelloWorldApiImpl implements HelloWorldApi {

    private final HelloWorldService service;

    public Set<HelloWorld> hello() {
        return service.helloWorld();
    }

}
