package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * OtherActivities entity which extends Event.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OtherActivities extends Event {
    private String other;
}
