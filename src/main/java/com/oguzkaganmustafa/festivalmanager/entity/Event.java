package com.oguzkaganmustafa.festivalmanager.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "eventId", scope = Event.class)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int eventId;
    private String name;
    private int duration;
    private String description;
    private Date date;

    @ManyToOne
    private FestivalRun festivalRun;


}

