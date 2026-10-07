package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    @Column(nullable = false,length = 20)
    private BigDecimal mantant;
    @Column(nullable = false,  length = 20)
    private LocalDate datPaiement;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private ModePaiement modePaiement;
    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private Contrat contract;
}
