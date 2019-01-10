package com.nikhilgupta.springframework.services;

import com.nikhilgupta.springframework.models.Owner;
import com.nikhilgupta.springframework.models.Vet;

import java.util.Set;

public class VetService extends CrudService<Vet,Long> {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
