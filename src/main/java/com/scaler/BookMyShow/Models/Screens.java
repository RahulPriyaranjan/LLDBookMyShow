package com.scaler.BookMyShow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity

public class Screens extends BaseModel{
    private String name;
    @OneToMany
    private List<Seats> seats;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // mapping table for screen and features
    private List<Feature> features;

}
