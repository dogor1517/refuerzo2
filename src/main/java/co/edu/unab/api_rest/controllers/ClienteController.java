package co.edu.unab.api_rest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.api_rest.models.ClienteModel;
import co.edu.unab.api_rest.services.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel>obtenerListaClientes(){
        return clienteService.obtenerClientes();
    }   

    @PostMapping()
    public ClienteModel guardarClienteNuevo(@RequestBody ClienteModel cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarCliente(@PathVariable("id") String id){
        if(clienteService.eliminarCliente(id)){
            return "Se elimino el cliente con Id: "+id;
        }else{
            return "No existe cliente con Id"+id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable("id") String id){
        return clienteService.obtenerPorId(id);
    }
    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<ClienteModel> obtenerClientePorNombre(@PathVariable("nombre") String nombre){
        return clienteService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "nombreapellido/{nombre}/{apellido}")
    public ArrayList<ClienteModel> obtenerClientePorNombreApellido(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
        return clienteService.obteterPorNombreApellido(nombre, apellido);
    }

    @GetMapping(path = "/puntosmayor/{puntos}")
    public ArrayList<ClienteModel> obtenerPorPuntosMayorIgual(@PathVariable("puntos") Long puntos){
        return clienteService.obtenerPorPuntosMayorIgual(puntos);
    }

    @GetMapping(path = "/puntosmenor/{puntos}")
    public ArrayList<ClienteModel> obtenerPorPuntosMenorIgual(@PathVariable("puntos") Long puntos){
        return clienteService.obtenerPorPuntosMenorIgual(puntos);
    }

    @GetMapping(path = "/ciudad/{ciudad}")
    public ArrayList<ClienteModel> nombresApellidosPorCiudad(@PathVariable("ciudad") String ciudad){
        return clienteService.obtenerNombresCompletosPorCiudad(ciudad);
    }
}
