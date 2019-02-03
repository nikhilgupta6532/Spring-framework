package com.nikhilgupta.springframework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;
}
