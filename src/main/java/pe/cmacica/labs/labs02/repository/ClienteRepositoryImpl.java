package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements  ClienteRepository {


    @Value("${labs02.nombre}")
    private String nombre;

    @Value("${labs02.cuenta}")
    private String cuenta;

    @Autowired
    //@Qualifier("clienteProxyV2")
    private ClienteProxy clienteProxy;

    @Override
    public String getNombres(int id) {
        return nombre;
    }

    @Override
    public String getCuenta(int id) {
        return cuenta;
    }

    @Override
    public int calcular(int n1, int n2) {
        return clienteProxy.calcular(n1,n2);
    }

}
