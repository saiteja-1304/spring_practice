package com.Ust.online_ticket_booking.repository;

import com.Ust.online_ticket_booking.model.TrainTicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookingrepository extends JpaRepository<TrainTicketBooking, Integer>{
    //JpaRepository has two arguments one is class (which class you would like to connect with  database) and the primary key datatype in that class

}
