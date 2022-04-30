package com.oguzkaganmustafa.festivalmanager.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Organiser {
    @Id
    String email;
    String name;
    String surname;
    String phoneNumber;
}
