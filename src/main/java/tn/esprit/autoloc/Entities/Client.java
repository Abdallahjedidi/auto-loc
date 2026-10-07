package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column(nullable = false, length = 20)
    private String nom;
    @Column(nullable = false, length = 20)
    private String prenom;
    @Column(nullable = false, length = 20)
    private String email;
    @Column(nullable = false, unique = true, length = 20)
    private String telephone;
    @Column(nullable = false, length = 20)
    private String numPermis;
    @Column(nullable = false, length = 20)
    private LocalDate dateInscription;
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="client")
    private Set<Reservation> reservation;

}
