package com.HelloEvents.HelloEvents.Controller;


import com.HelloEvents.HelloEvents.Dto.ReservatioDto;
import com.HelloEvents.HelloEvents.Services.ResrvationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/reservation")
public class ReservationController {

    public ResrvationService resrvationService;

    @PostMapping
    public ReservatioDto addReservation(@RequestBody ReservatioDto reservatioDto){
        return resrvationService.Resrever(reservatioDto);
    }

    @GetMapping
    public List<ReservatioDto> getAllReservations(){
        return resrvationService.getAllReservation();
    }

    @GetMapping("/{id}")
    public ReservatioDto getreservationById(@PathVariable  Long id ){
        return resrvationService.getReservationById(id);
    }

    @GetMapping("/{eventId}")
    public List<ReservatioDto> getReservationsByEvenement_IdEvent(@PathVariable  Long eventId){
        return resrvationService.getReservationByEvent(eventId);
    }
}
