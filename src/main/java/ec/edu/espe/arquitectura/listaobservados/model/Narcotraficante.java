package ec.edu.espe.arquitectura.listaobservados.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "narcotraficantes")
@TypeAlias("narcotraficantes")
public class Narcotraficante {

    @Id
    private String id;

    @Indexed(name = "idxu_narcotraficante_nombreCompleto", unique = false)
    private String nombreCompleto;

    @Indexed(name = "idxu_narcotraficante_sancionado", unique = false)
    private String sancionado;

}
