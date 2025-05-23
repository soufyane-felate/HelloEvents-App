package Services;


import Dto.ReservatioDto;
import Mapper.ReservationMapper;
import Repository.ClientRepository;
import Repository.EventRepository;
import Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import model.Reservation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ResrvationService {


    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final EventRepository eventRepository;
    private ReservationMapper reservationMapper;

    @Transactional
    public ReservatioDto Resrever(ReservatioDto reservatioDto){
        var client = clientRepository.findById(reservatioDto.getClientid()).orElse(null);
        var event = eventRepository.findById(reservatioDto.getEventId()).orElse(null);

        var res = reservationRepository.save(new Reservation(null,client,event));
        return new ReservatioDto(res.getIdreservation(), res.getClient().getId(), res.getEvenement().getIdEvent());
    }

    public List<ReservatioDto>  getAllReservation(){
        return reservationRepository.findAll().stream()
                .map(res->reservationMapper.reservationToDto(res))
                .toList();
    }

    public ReservatioDto getReservationById(Long id){
        return reservationRepository.findById(id)
                .map(ress->reservationMapper.reservationToDto(ress))
                .orElseThrow(()->new RuntimeException("Reservation Not Found"));
    }



}
