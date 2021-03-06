package postgreSQL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postgreSQL.model.Persona;
import postgreSQL.repository.PersonaResporitory;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaResporitory personaRepository;


    public Persona create (Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> getAllPersonas (){
        return personaRepository.findAll();
    }

    public void delete (Persona persona) {
        personaRepository.delete(persona);
    }

    public Optional<Persona> findById (Long id) {
        return personaRepository.findById(id);
    }

}
