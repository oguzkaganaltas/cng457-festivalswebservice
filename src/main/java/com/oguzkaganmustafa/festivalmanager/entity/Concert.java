package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Concert entity which extends Event. It has ManyToOne performer connection to keep performer name in it.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Concert extends Event{

    @ManyToOne
    private Performer performer;
}
