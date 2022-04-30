package com.oguzkaganmustafa.festivalmanager.entity;

import com.oguzkaganmustafa.festivalmanager.helper.PerformerID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Performer{
    @EmbeddedId
    PerformerID performerID;
}
