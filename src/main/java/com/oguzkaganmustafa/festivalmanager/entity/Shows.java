package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
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
public class Shows extends Event{
    private String showName;

    @ManyToMany(mappedBy = "shows", fetch = FetchType.LAZY)
    private List<Performer> performers;
}
