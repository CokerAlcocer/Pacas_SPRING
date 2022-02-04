package mx.edu.utez.ropa.user;

import mx.edu.utez.ropa.person.Person;
import mx.edu.utez.ropa.rol.Rol;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "person_id", unique = true, nullable = false)
    private Person person;

    @Column(columnDefinition = "text", unique = true, nullable = false)
    private String username;

    @Column(columnDefinition = "text", nullable = false)
    private String password;

    @ManyToMany(mappedBy = "users")
    private List<Rol> authorities;
}
