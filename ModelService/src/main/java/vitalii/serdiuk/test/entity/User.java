package vitalii.serdiuk.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by vserdiuk
 */

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "birthday")
    private Date birthday;

    public User() {

    }

}
