package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import models.enums.BookingStatus;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    private Date bookedAt;

    @OneToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;

    @OneToMany
    private List<Payment> payment;

    @Enumerated
    private BookingStatus bookingStatus;
}
