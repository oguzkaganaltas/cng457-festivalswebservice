package com.oguzkaganmustafa.festivalmanager.entity;

import com.oguzkaganmustafa.festivalmanager.helper.FestivalRunId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FestivalRun {
    @EmbeddedId
    private FestivalRunId festivalRunId;
    private String duration;

    @ManyToOne
    private Festival festival;
}
