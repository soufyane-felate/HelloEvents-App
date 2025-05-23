package repository;

import dto.ClientDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<ClientDto, Long> {


}
