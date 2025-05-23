package controller;

import dto.ClientDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ClientService;

import java.util.List;

@RestController
public class ClientController {

    private ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    //@GetMapping
  //  public List<ClientDto>  getClient() {}

}
