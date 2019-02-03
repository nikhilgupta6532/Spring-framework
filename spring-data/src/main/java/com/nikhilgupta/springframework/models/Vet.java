package com.nikhilgupta.springframework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Vet extends Person {
    private Long id;
    private Set<Speciality> specialities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
