package com.HelloEvents.HelloEvents.Mapper;


import com.HelloEvents.HelloEvents.Dto.ClientDto;
import com.HelloEvents.HelloEvents.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {

    ClientDto toClientDto(Client client);
    Client toCliententity(ClientDto clientDto);

}


