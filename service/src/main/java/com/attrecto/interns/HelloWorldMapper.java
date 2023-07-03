package com.attrecto.interns;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMapper {

    public HelloWorld map(HelloWorldEntity entity) {
        HelloWorld dto = new HelloWorld();
        dto.setName(entity.getName());
        return dto;
    }
}
