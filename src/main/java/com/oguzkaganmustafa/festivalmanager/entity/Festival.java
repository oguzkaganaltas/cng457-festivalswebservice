package com.oguzkaganmustafa.festivalmanager.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Festival entity. It has OneToMany FestivalRun connection to keep different FestivalRuns in it.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int festivalId;

    private String festivalName;
    private String place;

    @OneToMany(mappedBy = "festival")
    private List<FestivalRun> festivalRunList;
}
