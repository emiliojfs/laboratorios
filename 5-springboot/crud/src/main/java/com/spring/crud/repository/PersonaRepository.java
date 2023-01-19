package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
