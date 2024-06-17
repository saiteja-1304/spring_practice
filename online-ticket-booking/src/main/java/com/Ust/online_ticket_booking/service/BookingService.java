package com.Ust.online_ticket_booking.service;


import com.Ust.online_ticket_booking.model.TrainTicketBooking;
import com.Ust.online_ticket_booking.repository.Bookingrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.stream.ImageInputStreamImpl;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private Bookingrepository repo;

    public TrainTicketBooking addbooking(TrainTicketBooking trainTicketBooking){
        return repo.save(trainTicketBooking);
    }
    public List<TrainTicketBooking> addBookings(List<TrainTicketBooking> trainTicketBookings){
        return repo.saveAll(trainTicketBookings);
    }
public List<TrainTicketBooking>listBookings(){
        return repo.findAll();
}
public TrainTicketBooking getBooking(int id){
        return repo.findById(id).orElse(null);
}
public String deleteBooking(int id){
        repo.deleteById(id);
        return "booking deleted with id = "+id;
}
public TrainTicketBooking updateBooking(int id, TrainTicketBooking trainTicketBooking){
    TrainTicketBooking existingBooking = repo.findById(id).orElse(null);
    existingBooking.setUserName(trainTicketBooking.getUserName());
    existingBooking.setUserEmail(trainTicketBooking.getUserEmail());
    existingBooking.setUserPhone(trainTicketBooking.getUserPhone());
    existingBooking.setUserAddress(trainTicketBooking.getUserAddress());
    existingBooking.setUserCity(trainTicketBooking.getUserCity());
    existingBooking.setUserState(trainTicketBooking.getUserState());
    existingBooking.setUserCountry(trainTicketBooking.getUserCountry());
    existingBooking.setTrainDepartureTime(trainTicketBooking.getTrainDepartureTime());
    existingBooking.setTrainArrivalTime(trainTicketBooking.getTrainArrivalTime());
    existingBooking.setTrainPrice(trainTicketBooking.getTrainPrice());
    repo.save(existingBooking);
    return trainTicketBooking;

}

}
