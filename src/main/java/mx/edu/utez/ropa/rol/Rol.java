package mx.edu.utez.ropa.rol;

import mx.edu.utez.ropa.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<User> users;
}
