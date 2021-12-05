package co.edu.unab.api_rest.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.api_rest.models.ClienteModel;
import co.edu.unab.api_rest.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public boolean eliminarCliente(String id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<ClienteModel> obtenerPorId(String id){

        return clienteRepository.findById(id);
    }

    public ArrayList<ClienteModel> obtenerPorNombre(String nombre){
        return clienteRepository.findByNombre(nombre);
    }

    public ArrayList<ClienteModel>obteterPorNombreApellido(String nombre, String apellido){
        return clienteRepository.nombresApellidos(nombre, apellido);
    }

    public ArrayList<ClienteModel>obtenerPorPuntosMayorIgual(Long puntos){
        return clienteRepository.findByPuntosGreaterThanEqual(puntos);
    }

    public ArrayList<ClienteModel>obtenerPorPuntosMenorIgual(Long puntos){
        return clienteRepository.findByPuntosLessThanEqual(puntos);
    }

    public ArrayList<ClienteModel>obtenerNombresCompletosPorCiudad(String ciudad){
        return clienteRepository.obtenerPorCiudad(ciudad);
    }
}
