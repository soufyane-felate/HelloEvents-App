package Services;


import Dto.ClientDto;
import Mapper.ClientMapper;
import Repository.ClientRepository;
import model.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private ClientMapper clientMapper;

    public ClientService(ClientRepository clientRepository , ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Transactional
    public ClientDto SaveClient(ClientDto clientDto){
        return clientMapper.toClientDto(clientRepository.save(clientMapper.toCliententity(clientDto)));
    }

    public List<ClientDto> getallClients(){
        return clientRepository.findAll().stream()
                .map(client ->clientMapper.toClientDto(client)).toList();
    }

    public ClientDto getClientByid(Long id){
        return clientRepository.findById(id)
                .map(client -> clientMapper.toClientDto(client))
                .orElseThrow(()-> new RuntimeException("Client not found"));
    }

    public ClientDto modifierClient(Long id ,ClientDto clientDto){
        Client client= clientRepository.findById(id).get();
            client.setFirstName(clientDto.getFirstName());
            client.setLastName(clientDto.getLastName());
            client.setEmail(clientDto.getEmail());
            client.setPassword(clientDto.getPassword());

            return clientMapper.toClientDto(clientRepository.save(client));
    }

    public void deleteClient(Long id){
         clientRepository.deleteById(id);
    }
}
