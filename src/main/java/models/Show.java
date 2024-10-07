package models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import models.enums.Feature;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

    private Date startTime;
    private Date endTime;

    @Enumerated
    @ElementCollection
    private List<Feature> features;
}
