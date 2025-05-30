package com.HelloEvents.HelloEvents.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter  @Setter
public class Client extends User {

    public Client() {
        this.setRole(Role.CLIENT);
    }



    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Reservation> reservations;

}
