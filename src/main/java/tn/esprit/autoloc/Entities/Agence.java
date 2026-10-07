package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    @Column(nullable = false, length = 20)
    private String nom;
    @Column(nullable = false, length = 20)
    private String ville;
    @Column(nullable = false, length = 20)
    private String addresss;
    @Column(nullable = false, unique = true, length = 20)
    private String telephone;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "agence",fetch = FetchType.LAZY)
    private Set<Vehicule> vehicule;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "agence",fetch = FetchType.LAZY)
    private Set<Employe> employe;

}
