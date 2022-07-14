package ec.edu.espe.arquitectura.listaobservados.resource;

import ec.edu.espe.arquitectura.listaobservados.dto.ClienteDTO;
import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import ec.edu.espe.arquitectura.listaobservados.service.CoreClientService;
import ec.edu.espe.arquitectura.listaobservados.service.NarcotraficanteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/narcotraficante")
public class NarcotraficanteResource {

    private final NarcotraficanteService service;
    private final CoreClientService coreCliente;
    /*public ClientResource(ProductClientService service) {
        this.service = service;
    }*/

    public NarcotraficanteResource(NarcotraficanteService service, CoreClientService coreCliente) {
        this.service = service;
        this.coreCliente = coreCliente;
    }

    @GetMapping
    public ResponseEntity<Narcotraficante> obtenerCliente() {
       // System.err.println("Antes del call");
        return ResponseEntity.ok(Narcotraficante);

    }



}
