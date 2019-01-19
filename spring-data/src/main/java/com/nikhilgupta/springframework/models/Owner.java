package com.nikhilgupta.springframework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Owner {
    private Long id;
    private String firstName;
    private String lastName;
}
