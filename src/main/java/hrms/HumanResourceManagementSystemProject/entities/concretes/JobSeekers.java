package hrms.HumanResourceManagementSystemProject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "job_seekers")

public class JobSeekers {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "tcNo")
    private String tcNo;
    @Column(name = "birth_year")
     private int birthYear;
    @Column(name = "Email")
    private String email;
    @JsonInclude
    @Transient
    private String passwordCheck;
}
