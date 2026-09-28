package com.tickethub.repository;
import com.tickethub.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking,Long> {}