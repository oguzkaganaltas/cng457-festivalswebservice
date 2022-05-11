package com.oguzkaganmustafa.festivalmanager.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * FestivalRun Entity. It has ManyToOne Festival connection to keep Festival which it belongs to, OneToMany Event connection
 * to keep different events in it, and ManyToMany Organiser connection to keep Organisers in it.
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FestivalRun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int festRunId;

    private int duration;

    @ManyToOne
    private Festival festival;

    @OneToMany(mappedBy = "festivalRun")
    private List<Event> eventList;

    @ManyToMany(mappedBy = "festivalRuns", fetch = FetchType.EAGER)
    private List<Organiser> organisers;
}
