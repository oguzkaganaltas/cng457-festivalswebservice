package com.oguzkaganmustafa.festivalmanager.helper;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;

@Data
@Embeddable
public class FestivalRunId implements Serializable {
    private int festivalId;
    private Date runDate;
}
