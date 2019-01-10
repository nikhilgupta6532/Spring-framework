package com.nikhilgupta.springframework.services;

import java.util.Set;

public class CrudService<T,ID> {
    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
