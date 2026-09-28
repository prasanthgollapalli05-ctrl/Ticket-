package com.tickethub.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="shows")
public class Show {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate showDate;
    private LocalTime showTime;
    private String screenName;
    private int totalSeats;

    @ManyToOne private Movie movie;
    @ManyToOne private Theatre theatre;

    public Show(){}
    public Long getId(){return id;}
    public LocalDate getShowDate(){return showDate;}
    public void setShowDate(LocalDate v){showDate=v;}
    public LocalTime getShowTime(){return showTime;}
    public void setShowTime(LocalTime v){showTime=v;}
    public String getScreenName(){return screenName;}
    public void setScreenName(String v){screenName=v;}
    public int getTotalSeats(){return totalSeats;}
    public void setTotalSeats(int v){totalSeats=v;}
    public Movie getMovie(){return movie;}
    public void setMovie(Movie v){movie=v;}
    public Theatre getTheatre(){return theatre;}
    public void setTheatre(Theatre v){theatre=v;}
}