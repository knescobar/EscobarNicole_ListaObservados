package ec.edu.espe.arquitectura.listaobservados.dao;

import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface NarcotraficanteRepository  extends MongoRepository<Narcotraficante, String> {

    Optional <Narcotraficante> findByNombreCompleto(String nombreCompleto);

}
