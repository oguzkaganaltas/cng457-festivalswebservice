package com.oguzkaganmustafa.festivalmanager.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shows extends Event{
    private String showName;

    /*@ManyToMany(mappedBy = "shows", fetch = FetchType.EAGER)
    private List<Performer> performers;*/
}
