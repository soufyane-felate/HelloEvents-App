package Services;


import Dto.EventDto;
import Mapper.EventMapper;
import Repository.EventRepository;
import lombok.AllArgsConstructor;
import model.Evenement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private EventMapper eventMapper;


    @Transactional
    public EventDto AddEvent(EventDto eventDto) {
        return eventMapper.eventToDto(eventRepository.save(eventMapper.dtoToEvent(eventDto)));
    }

    public List<EventDto> getAllEvents() {
        return eventRepository.findAll().stream()
                .map(event ->eventMapper.eventToDto(event))
                .toList();
    }

    public EventDto getEventById(Long id){
        return eventRepository.findById(id)
                .map(evenement -> eventMapper.eventToDto(evenement))
                .orElseThrow(()->new RuntimeException("event not found"));
    }

    public EventDto updateEvent(Long id , EventDto eventDto) {
        Evenement ev = eventRepository.findById(id).get();
                ev.setEventname(eventDto.getEventname());
                ev.setType(eventDto.getType());
                ev.setDescription(eventDto.getDescription());

                return eventMapper.eventToDto(eventRepository.save(eventMapper.dtoToEvent(eventDto)));

    }

    public void deleteEvent(Long id){
        eventRepository.deleteById(id);
    }




}
