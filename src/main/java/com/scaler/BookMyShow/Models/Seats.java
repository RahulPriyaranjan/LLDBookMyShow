package com.scaler.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Seats extends BaseModel{
    private int RowVal;
    private int ColVal;
    private String seatNumber;
    @ManyToOne
    private SeatType Seattype;

}
