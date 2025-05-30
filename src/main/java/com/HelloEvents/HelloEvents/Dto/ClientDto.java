package com.HelloEvents.HelloEvents.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor


public class ClientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

   // List<ReservatioDto>reservations;
}

