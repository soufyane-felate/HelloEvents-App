package com.HelloEvents.HelloEvents.Repository;

import com.HelloEvents.HelloEvents.Dto.ReservatioDto;
import com.HelloEvents.HelloEvents.model.Client;
import com.HelloEvents.HelloEvents.model.Reservation;
import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByClient(Client client);

        List<Reservation> getReservationsByEvenement_IdEvent(Long evenementIdEvent);

}
