package com.HelloEvents.HelloEvents.Mapper;


import com.HelloEvents.HelloEvents.Dto.EventDto;
import com.HelloEvents.HelloEvents.model.Evenement;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    EventDto eventToDto(Evenement evenement);
    Evenement dtoToEvent(EventDto eventDto);
}
