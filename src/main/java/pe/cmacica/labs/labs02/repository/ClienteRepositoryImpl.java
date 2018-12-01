package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements  ClienteRepository {

    @Autowired
    private ClienteProxy clienteProxy;

    @Override
    public String getNombres(int id) {
        return "Nuevo Cliente";
    }

    @Override
    public String getCuenta(int id) {
        return "23423423423";
    }

    @Override
    public int calcular(int n1, int n2) {
        return clienteProxy.calcular(n1,n2);
    }

}
