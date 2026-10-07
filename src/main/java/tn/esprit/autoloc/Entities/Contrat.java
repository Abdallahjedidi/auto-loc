package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.action.internal.OrphanRemovalAction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    @Column(nullable = false,length = 20)
    private LocalDate dateSignature;
    @Column(nullable = false,  length = 20)
    private BigDecimal MontantTotal;
    @Column(nullable = false, length = 20)
    private boolean valide;
    @OneToOne
    private Reservation reservation;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="contract", orphanRemoval =true,fetch=FetchType.LAZY)
    private Set<Paiement> paiement;

}
