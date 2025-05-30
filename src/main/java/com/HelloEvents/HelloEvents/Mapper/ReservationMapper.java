package com.HelloEvents.HelloEvents.Mapper;


import com.HelloEvents.HelloEvents.Dto.ReservatioDto;
import com.HelloEvents.HelloEvents.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ReservationMapper {

    //@Mapping(source = "idreservation", target = "idReservation")
    ReservatioDto reservationToDto(Reservation reservation);
    Reservation DtoToReservation(ReservatioDto dto);

   Reservation reservationDtoToDto(Reservation reservation);
}
