package ejercicio.Luismi.Registro.Repository;

import ejercicio.Luismi.Registro.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
