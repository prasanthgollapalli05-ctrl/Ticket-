package com.tickethub.service;
import com.tickethub.model.Booking;
import com.tickethub.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class BookingService {
    private final BookingRepository repo;
    @Value("${tickethub.gst-rate:18}") private double gstRate;

    public BookingService(BookingRepository repo){this.repo=repo;}

    public Booking create(Booking b){
        double ticket = b.getTicketAmount();
        double gst = ticket * gstRate / 100.0;
        b.setGstAmount(gst);
        b.setTotalAmount(ticket + gst);
        b.setBookingCode("TH-" + UUID.randomUUID().toString().substring(0,8).toUpperCase());
        b.setStatus("CONFIRMED");
        b.setBookedAt(LocalDateTime.now());
        return repo.save(b);
    }
}