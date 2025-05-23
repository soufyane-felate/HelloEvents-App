package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idEvent;

    private String eventname;

    private String description;

    private String type;

    @OneToMany(mappedBy = "evenement" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Reservation> reservations;

    @ManyToOne
    private Admin admin;






}
