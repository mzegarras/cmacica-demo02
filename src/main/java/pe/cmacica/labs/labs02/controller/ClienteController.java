package pe.cmacica.labs.labs02.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cmacica.labs.labs02.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private  ClienteService clienteService;


    //http://localhost:8080/customer/{id}/facturas{idfactura}

    //http://localhost:8080/cliente/80990
    @GetMapping("/{id}")
    public HttpEntity<String> getNombres(@PathVariable("id") int id){

        //ClienteService clienteService = new ClienteServiceImpl();

        return ResponseEntity.ok(clienteService.getNombres(id));

    }

    //http://localhost:8080/cliente/calcular?n1=5&n2=6
    ///calcular?n1=5&n2=6
    @GetMapping("/calcular")
    public HttpEntity<Integer> calcular(@RequestParam("n1") int n1,
                                        @RequestParam("n2") int n2){

        Integer rp = clienteService.calcular(n1,n2);

        return ResponseEntity.ok(rp);

    }
}
