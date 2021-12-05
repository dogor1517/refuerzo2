package co.edu.unab.api_rest.repositories;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import co.edu.unab.api_rest.models.ClienteModel;

public interface ClienteRepository extends MongoRepository<ClienteModel, String>{
    
    ArrayList<ClienteModel> findByNombre (String nombre);

    ArrayList<ClienteModel>findByPuntosGreaterThanEqual(Long puntos);

    ArrayList<ClienteModel> findByPuntosLessThanEqual(Long puntos);

    @Query("{'nombre':?0, 'apellido':?1}")
    ArrayList<ClienteModel> nombresApellidos(String nombre, String apellido);

    @Query(value = "{'direccion.ciudad':?0}", fields= "{'nombre': 1, 'apellido': 1}")
    ArrayList<ClienteModel> obtenerPorCiudad(String ciudad);
}
