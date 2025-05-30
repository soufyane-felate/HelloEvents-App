package com.HelloEvents.HelloEvents.Controller;


import com.HelloEvents.HelloEvents.Dto.EventDto;
import com.HelloEvents.HelloEvents.Services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/event")
public class EventController {

    public EventService eventService;

    @PostMapping
    public EventDto addEvent(@RequestBody EventDto eventDto) {
        return eventService.AddEvent(eventDto);
    }
    @GetMapping
    public List<EventDto> getAllEvents(){
        return eventService.getAllEvents();
    }
    @GetMapping("/{id}")
    public EventDto getEventById(@PathVariable Long id ) {
        return  eventService.getEventById(id);
    }
    @PutMapping("/{id}")
    public EventDto updatEvent(@PathVariable Long id ,@RequestBody EventDto eventDto) {
        return eventService.updateEvent(id,eventDto);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id ) {
        eventService.deleteEvent(id);
    }




}
