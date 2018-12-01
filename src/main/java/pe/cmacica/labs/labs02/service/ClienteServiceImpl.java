package pe.cmacica.labs.labs02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cmacica.labs.labs02.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public String getNombres(int id) {
        return clienteRepository.getNombres(id);
    }

    @Override
    public String getCuenta(int id) {
        return "12323491232-1312";
    }
}
