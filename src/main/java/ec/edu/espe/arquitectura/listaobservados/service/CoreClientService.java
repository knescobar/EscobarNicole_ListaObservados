package ec.edu.espe.arquitectura.listaobservados.service;

import ec.edu.espe.arquitectura.listaobservados.dto.ClienteDTO;
import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreClientService {

    private static final String BASE_URL = "http://localhost:8080/cliente";

    private final RestTemplate restTemplate;

    public CoreClientService() {
        this.restTemplate = new RestTemplate(getClientHttpRequestFactory());
    }

    public ClienteDTO obtener( String nombreCompleto) {
        ResponseEntity<ClienteDTO> response = this.restTemplate.getForEntity(BASE_URL+"/"+nombreCompleto, ClienteDTO.class);
        ClienteDTO dto = response.getBody();


        return dto;
    }





    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        int connectTimeout = 5000;
        int readTimeout = 5000;
        clientHttpRequestFactory.setConnectTimeout(connectTimeout);
        clientHttpRequestFactory.setReadTimeout(readTimeout);
        return clientHttpRequestFactory;
    }



}
