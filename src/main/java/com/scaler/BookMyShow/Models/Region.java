package com.scaler.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity // it will take class name as table name or else use @entity(name="table name")
public class Region extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatre;
}
