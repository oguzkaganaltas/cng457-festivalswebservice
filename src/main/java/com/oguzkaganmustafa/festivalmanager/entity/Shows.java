package com.oguzkaganmustafa.festivalmanager.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Shows entity which extends Event. It has ManyToMany performer connection to keep performers name in it.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class Shows extends Event{

    @ManyToMany(mappedBy = "shows", fetch = FetchType.LAZY)
    private List<Performer> performers;
}
