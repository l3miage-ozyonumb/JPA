package fr.uga.l3miage.tp1.exo2;

import javax.persistence.*;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nb_devices")
    private int numberOfDevices;

    @Enumerated(EnumType.STRING)
    @Column(name = "typeAccount")
    private typeAccount typeAccountt;

    @OneToOne
    @JoinColumn(name = "uuid_user", referencedColumnName = "uuid")
    private NetflixUserEntity user;

    // Getters and setters omitted for brevity
}
