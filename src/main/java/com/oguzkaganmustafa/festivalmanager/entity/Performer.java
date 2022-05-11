package com.oguzkaganmustafa.festivalmanager.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Performer Entity. It has OneToMany Concert connection to keep performer name for a concert, and ManyToMany Shows connection
 * to keep all performers for a specific show.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "performerId")
public class Performer{
    @Id
    private int performerId;

    private String name;
    private String  surname;

    @OneToMany(mappedBy = "performer")
    private List<Concert> concertList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ShowsPerformers",
            joinColumns = @JoinColumn(name = "performerId"),
            inverseJoinColumns = @JoinColumn(name = "eventId"))
    private List<Shows> shows;
}
