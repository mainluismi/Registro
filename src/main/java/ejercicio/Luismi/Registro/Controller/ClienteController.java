package ejercicio.Luismi.Registro.Controller;

import ejercicio.Luismi.Registro.Entity.Ciudad;
import ejercicio.Luismi.Registro.Entity.Cliente;
import ejercicio.Luismi.Registro.Service.CiudadService;
import ejercicio.Luismi.Registro.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("views/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private CiudadService ciudadService;

    @GetMapping("/")
    public String listarClientes(Model model){
        List<Cliente> listadoClientes = clienteService.listarTodos();
        model.addAttribute("titulo","Lista de clientes");
        model.addAttribute("clientes", listadoClientes);
        return "views/clientes/listar";
    }

    @GetMapping("/create")
    public String crear(Model model){
        Cliente cliente = new Cliente();
        List<Ciudad> listCiudades = ciudadService.listarCiudades();
        model.addAttribute("titulo","Formulario: Nuevo cliente");
        model.addAttribute("cliente", cliente);
        model.addAttribute("ciudades", listCiudades);
        return "views/clientes/frmCrear";
    }
}
