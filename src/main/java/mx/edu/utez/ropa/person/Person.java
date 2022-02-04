package mx.edu.utez.ropa.person;

import mx.edu.utez.ropa.user.User;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "person")
    private User user;
}
