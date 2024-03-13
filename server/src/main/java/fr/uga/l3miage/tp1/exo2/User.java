package fr.uga.l3miage.tp1.exo2;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private boolean SSO;

    private OffsetDateTime lastConnexion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_id", referencedColumnName = "idSession")
    private Session session;
}
