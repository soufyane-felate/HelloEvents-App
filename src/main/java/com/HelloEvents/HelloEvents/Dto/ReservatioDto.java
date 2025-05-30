package com.HelloEvents.HelloEvents.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor  @AllArgsConstructor
public class ReservatioDto {
    private Long idReservation;
    private Long clientid;
    private Long eventId;

}
