package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Performer{
    @Id
    private int performerId;

    private String name;
    private String  surname;

    @OneToMany(mappedBy = "performer")
    private List<Concert> concertList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ShowsPerformers",
            joinColumns = @JoinColumn(name = "performerID"),
            inverseJoinColumns = @JoinColumn(name = "eventId"))
    private List<Shows> shows;
}
