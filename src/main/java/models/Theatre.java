package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.enums.TheatreStatus;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;

    @OneToMany
    private List<Screen> screens;

    @Enumerated(value = EnumType.STRING)
    private TheatreStatus theatreStatus;

    @ManyToOne
    private Region region;
}
