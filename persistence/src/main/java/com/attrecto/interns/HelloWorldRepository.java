package com.attrecto.interns;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, String> {
}
