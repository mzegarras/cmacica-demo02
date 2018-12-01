package pe.cmacica.labs.labs02.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.cmacica.labs.labs02.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private  ClienteService clienteService;



    @GetMapping("/")
    public HttpEntity<String> getNombres(){

        //ClienteService clienteService = new ClienteServiceImpl();

        return ResponseEntity.ok(clienteService.getNombres(0));

    }

}
