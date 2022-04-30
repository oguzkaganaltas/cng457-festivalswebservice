package com.oguzkaganmustafa.festivalmanager.helper;


import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable

public class PerformerID implements Serializable {
    String name;
    String surname;
}
