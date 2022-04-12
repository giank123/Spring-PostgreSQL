package postgreSQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import postgreSQL.model.Persona;

public interface PersonaResporitory extends JpaRepository<Persona, Long> {
}
