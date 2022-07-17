package com.example.planting_support.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "roslina")
public class Roslina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer gatunek_id;
    private Integer grupa_roslin_id;
    private String nazwa;
    private String nazwa_potoczna;
    private String opis;
    private String stanowisko;
    private String wymagania;
    private String wilgotnosc;
    private Integer wysokosc;
}
