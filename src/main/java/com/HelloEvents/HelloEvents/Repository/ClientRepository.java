package com.HelloEvents.HelloEvents.Repository;

import com.HelloEvents.HelloEvents.Dto.ClientDto;
import com.HelloEvents.HelloEvents.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
