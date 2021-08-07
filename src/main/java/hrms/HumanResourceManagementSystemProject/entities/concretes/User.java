package hrms.HumanResourceManagementSystemProject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "users")

@Inheritance(strategy = InheritanceType.JOINED)
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private  String email;
    @Column(name = "password")
    private String password;


}
