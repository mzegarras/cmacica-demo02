package pe.cmacica.labs.labs02.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements  ClienteRepository {

    @Override
    public String getNombres(int id) {
        return "Nuevo Cliente";
    }

}
