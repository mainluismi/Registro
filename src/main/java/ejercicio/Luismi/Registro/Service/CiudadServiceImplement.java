package ejercicio.Luismi.Registro.Service;

import ejercicio.Luismi.Registro.Entity.Ciudad;
import ejercicio.Luismi.Registro.Repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImplement implements CiudadService{
    @Autowired
    CiudadRepository ciudadRepository;
    @Override
    public List<Ciudad> listarCiudades() {
        return (List<Ciudad>) ciudadRepository.findAll();
    }
}
