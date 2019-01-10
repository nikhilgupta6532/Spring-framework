package com.nikhilgupta.springframework.services;

import com.nikhilgupta.springframework.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
