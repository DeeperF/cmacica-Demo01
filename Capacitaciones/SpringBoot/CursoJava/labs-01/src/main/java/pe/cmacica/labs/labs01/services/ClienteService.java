package pe.cmacica.labs.labs01.services;

import pe.cmacica.labs.labs01.repository.ClienteRepository;

public class ClienteService {


    private ClienteRepository clienteRepository;
    public ClienteService(){
        this.clienteRepository = new ClienteRepository();
    }

    public void guardar() {
        this.clienteRepository.guardar();

    }


}
