package fr.uga.l3miage.tp1.exo2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "sessions")
public class Session {

    @Id
    private UUID idSession;

    private String lastCommand;

    private String currentDir;

    private boolean lock;

    @OneToOne(mappedBy = "session")
    private User user;

    // Getters and setters
}
