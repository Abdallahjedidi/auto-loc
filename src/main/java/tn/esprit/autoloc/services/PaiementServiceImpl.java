package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiement{
    private final PaiementRepo PaiementRepo;
    @Override
    public Paiement ajouterPaiement(Paiement pa) {
        return PaiementRepo.save(pa);
    }

    @Override
    public void supprimerPaiement(Long idPaiement) {
        PaiementRepo.deleteById(idPaiement);

    }

    @Override
    public List<Paiement> recuppererPaiement() {
        return PaiementRepo.findAll();
    }

    @Override
    public Set<Paiement> findPaiements() {
        return new HashSet<>(PaiementRepo.findAll());
    }

    @Override
    public Paiement recupererPaiementById(Long idPaiement) {
        return PaiementRepo.findById(idPaiement).get();
    }
}
