package ejercicio.Luismi.Registro.Service;

import ejercicio.Luismi.Registro.Entity.Ciudad;
import ejercicio.Luismi.Registro.Repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CiudadServiceImplement implements CiudadService{
    @Autowired
    CiudadRepository ciudadRepository;
    @Override
    public List<Ciudad> listarCiudades() {
        return (List<Ciudad>) ciudadRepository.findAll();
    }
}
