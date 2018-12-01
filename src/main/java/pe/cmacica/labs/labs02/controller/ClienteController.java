package pe.cmacica.labs.labs02.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cmacica.labs.labs02.config.MailProperties;
import pe.cmacica.labs.labs02.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClienteController.class);

    @Autowired
    private MailProperties mailProperties;

    @Autowired
    private  ClienteService clienteService;

    //@GetMapping("/{id}/facturas/{idfactura}")
    //http://localhost:8080/customer/{id}/facturas/{idfactura}

    //http://localhost:8080/cliente/80990
    @GetMapping("/{id}")
    public HttpEntity<String> getNombres(@PathVariable("id") int id){

        //ClienteService clienteService = new ClienteServiceImpl();
        LOGGER.debug("{}",mailProperties.getPassword());
        LOGGER.warn("{}",mailProperties.getServer());
        LOGGER.info("{}",mailProperties.getUser());

        //System.out.println(mailProperties.getPassword());
        //System.out.println(mailProperties.getServer());
        //System.out.println(mailProperties.getUser());


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
