package com.scaler.BookMyShow.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class Tickets extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<Payment> payments;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<ShowSeat> showSeats;
    private Date bookedAt;
    private int amount;


}
