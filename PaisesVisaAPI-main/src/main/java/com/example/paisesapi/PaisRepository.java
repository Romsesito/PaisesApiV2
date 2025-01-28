package com.example.paisesapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaisRepository extends MongoRepository<Pais, String> {
    Pais findByNombre(String nombre);
}
