package com.HelloEvents.HelloEvents.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreservation;
    @ManyToOne
    private Client client;



    @ManyToOne
    @JoinColumn(name = "eventId")
    private Evenement evenement;


}
