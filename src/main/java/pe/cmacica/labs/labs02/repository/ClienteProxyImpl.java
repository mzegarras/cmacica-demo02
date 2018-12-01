package pe.cmacica.labs.labs02.repository;

import org.springframework.stereotype.Component;

@Component
public class ClienteProxyImpl implements ClienteProxy {
    @Override
    public int calcular(int n1, int n2) {
        return  n1 + n2;
    }
}
