package com.tickethub.controller;
import com.tickethub.model.Booking;
import com.tickethub.repository.BookingRepository;
import com.tickethub.service.BookingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins="*")
public class BookingController {
    private final BookingService service;
    private final BookingRepository repo;
    public BookingController(BookingService service, BookingRepository repo){this.service=service;this.repo=repo;}
    @PostMapping public Booking create(@RequestBody Booking booking){return service.create(booking);}
    @GetMapping public List<Booking> all(){return repo.findAll();}
}