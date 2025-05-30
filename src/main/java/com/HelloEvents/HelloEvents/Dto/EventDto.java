package com.HelloEvents.HelloEvents.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    private Long idEvent;
    private String eventname;
    private String description;
    private String type;

}
