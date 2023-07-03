package com.attrecto.interns;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HelloWorldService {

    private final HelloWorldRepository repository;
    private final HelloWorldMapper mapper;

    public Set<HelloWorld> helloWorld() {
        return repository.findAll().stream().map(mapper::map).collect(Collectors.toSet());
    }
}
