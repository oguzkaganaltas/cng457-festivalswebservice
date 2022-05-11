package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Event entity to create a general event. It has ManyToOne FestivalRun connection to keep which FestivalRun it belongs to.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    private String name;
    private String duration;
    private String description;
    private Date date;

    @ManyToOne
    private FestivalRun festivalRun;


}

