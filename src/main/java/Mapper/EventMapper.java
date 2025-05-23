package Mapper;


import Dto.EventDto;
import model.Evenement;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    EventDto eventToDto(Evenement evenement);
    Evenement dtoToEvent(EventDto eventDto);
}
