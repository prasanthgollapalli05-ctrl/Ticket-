package com.tickethub.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookingCode;
    private String customerName;
    private String customerEmail;
    private String seatNumbers;
    private int quantity;
    private double ticketAmount;
    private double gstAmount;
    private double totalAmount;
    private String status;
    private LocalDateTime bookedAt;

    @ManyToOne private Movie movie;
    @ManyToOne private Theatre theatre;

    public Booking(){}
    public Long getId(){return id;}
    public String getBookingCode(){return bookingCode;}
    public void setBookingCode(String v){bookingCode=v;}
    public String getCustomerName(){return customerName;}
    public void setCustomerName(String v){customerName=v;}
    public String getCustomerEmail(){return customerEmail;}
    public void setCustomerEmail(String v){customerEmail=v;}
    public String getSeatNumbers(){return seatNumbers;}
    public void setSeatNumbers(String v){seatNumbers=v;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int v){quantity=v;}
    public double getTicketAmount(){return ticketAmount;}
    public void setTicketAmount(double v){ticketAmount=v;}
    public double getGstAmount(){return gstAmount;}
    public void setGstAmount(double v){gstAmount=v;}
    public double getTotalAmount(){return totalAmount;}
    public void setTotalAmount(double v){totalAmount=v;}
    public String getStatus(){return status;}
    public void setStatus(String v){status=v;}
    public LocalDateTime getBookedAt(){return bookedAt;}
    public void setBookedAt(LocalDateTime v){bookedAt=v;}
    public Movie getMovie(){return movie;}
    public void setMovie(Movie v){movie=v;}
    public Theatre getTheatre(){return theatre;}
    public void setTheatre(Theatre v){theatre=v;}
}