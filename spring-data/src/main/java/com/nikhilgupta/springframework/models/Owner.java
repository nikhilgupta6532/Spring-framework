package com.nikhilgupta.springframework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Owner extends Person {
    private Long id;
    private Set<Pet> pets = new HashSet<>();
    private String address;
    private String city;
    private String telephone;
}
