package com.tickethub.model;

import jakarta.persistence.*;

@Entity
public class Theatre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;

    public Theatre(){}
    public Theatre(String name,String city){this.name=name;this.city=city;}
    public Long getId(){return id;}
    public String getName(){return name;}
    public void setName(String v){name=v;}
    public String getCity(){return city;}
    public void setCity(String v){city=v;}
}