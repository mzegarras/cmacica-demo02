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
        return clienteRepository.getCuenta(id);
    }

    @Override
    public int calcular(int n1, int n2) {
        return clienteRepository.calcular(n1,n2);
    }


}
