package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.Paiement;

import java.util.List;
import java.util.Set;

public interface IPaiement {
    Paiement ajouterPaiement (Paiement  pa);
    void supprimerPaiement (Long idPaiement );
    List<Paiement > recuppererPaiement ();
    Set<Paiement > findPaiements();
    Paiement  recupererPaiementById(Long idPaiement );
}
