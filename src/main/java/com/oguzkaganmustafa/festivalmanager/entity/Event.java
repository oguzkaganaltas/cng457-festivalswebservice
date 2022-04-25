package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Event {

    @Id
    @Column(name = "eid")
    private int eventId;
    private String name;
    private String duration;
    private String description;
    private Date date;
}

