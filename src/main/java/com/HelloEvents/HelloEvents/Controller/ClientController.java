package com.HelloEvents.HelloEvents.Controller;

import com.HelloEvents.HelloEvents.Dto.ClientDto;
import com.HelloEvents.HelloEvents.Services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins = "*")
public class ClientController {



        private final ClientService clientService;

        public ClientController(ClientService clientService) {
            this.clientService = clientService;
        }

        @GetMapping
        public List<ClientDto> getAllClients() {
            return clientService.getallClients();
        }

        @GetMapping("/{id}")
        public ClientDto getClientById(@PathVariable Long id) {
            return clientService.getClientByid(id);
        }

        @PostMapping
        public ClientDto createClient(@RequestBody ClientDto clientDto) {
            return clientService.SaveClient(clientDto);
        }

        @PutMapping("/{id}")
        public ClientDto updateClient(@PathVariable Long id, @RequestBody ClientDto clientDto) {
            return clientService.modifierClient(id, clientDto);
        }

        @DeleteMapping("/{id}")
        public void deleteClient(@PathVariable Long id) {
            clientService.deleteClient(id);
        }


    }
