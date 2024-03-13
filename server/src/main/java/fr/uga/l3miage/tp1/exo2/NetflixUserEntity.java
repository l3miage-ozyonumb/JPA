package fr.uga.l3miage.tp1.exo2;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {

    @Id
    private Long id;

    private String uuid;

    private String lastname;

    private String firstname;

    @Enumerated(EnumType.STRING)
    private sex sex;

    private LocalDate birthDate;

    @OneToOne(mappedBy = "user")
    private NetflixAccountEntity account;


}
