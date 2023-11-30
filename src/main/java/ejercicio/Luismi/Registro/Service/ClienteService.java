package ejercicio.Luismi.Registro.Service;

import ejercicio.Luismi.Registro.Entity.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> listarTodos();
    public void guardar(Cliente cliente);
    public Cliente buscarPorId(Long id);
    public void eliminar(Long id);
}
