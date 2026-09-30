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

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @Column(nullable = false,length = 20)
    private LocalDate datDebut;
    @Column(nullable = false,  length = 20)
    private LocalDate datFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatuResrvation statut;

}
