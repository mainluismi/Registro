package ejercicio.Luismi.Registro.Service;

import ejercicio.Luismi.Registro.Entity.Ciudad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CiudadService {
    List<Ciudad> listarCiudades();

}
