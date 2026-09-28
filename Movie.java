package com.tickethub.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String language;
    private String genre;
    private double ticketPrice;

    public Movie() {}
    public Movie(String title, String language, String genre, double ticketPrice) {
        this.title = title; this.language = language; this.genre = genre; this.ticketPrice = ticketPrice;
    }
    public Long getId(){return id;}
    public String getTitle(){return title;}
    public void setTitle(String v){title=v;}
    public String getLanguage(){return language;}
    public void setLanguage(String v){language=v;}
    public String getGenre(){return genre;}
    public void setGenre(String v){genre=v;}
    public double getTicketPrice(){return ticketPrice;}
    public void setTicketPrice(double v){ticketPrice=v;}
}