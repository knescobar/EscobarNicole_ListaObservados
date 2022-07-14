package ec.edu.espe.arquitectura.listaobservados.service;

import ec.edu.espe.arquitectura.listaobservados.dao.NarcotraficanteRepository;
import ec.edu.espe.arquitectura.listaobservados.exception.EntityNotFoundException;
import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NarcotraficanteService {

    private NarcotraficanteRepository narcotraficanteRepository;

    public NarcotraficanteService(NarcotraficanteRepository narcotraficanteRepository) {
        this.narcotraficanteRepository = narcotraficanteRepository;
    }

    public Narcotraficante ConsultaListaObservados(String nombreCompleto){
        Optional <Narcotraficante> narcotraficante = this.narcotraficanteRepository.findByNombreCompleto(nombreCompleto);
        return narcotraficante.orElseThrow(
                () -> new EntityNotFoundException("No se encuentra en la lista de observados"));
    }
}
