package postgreSQL.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;

}
