package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    @Column(nullable = false,length = 20)
    private LocalDate datDebut;
    @Column(nullable = false,  length = 20)
    private LocalDate datFin;
    @Column(nullable = false, length = 20)
    private String description;
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private Vehicule vehicule;

}
