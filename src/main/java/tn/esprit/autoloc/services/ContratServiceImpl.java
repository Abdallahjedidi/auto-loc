package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Repositories.ContratRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContrat{

    private final ContratRepo ContratRepo;
    @Override
    public Contrat ajouterContrat(Contrat co) {
        return ContratRepo.save(co);
    }

    @Override
    public void supprimerContrat(Long idContrat) {
        ContratRepo.deleteById(idContrat);

    }

    @Override
    public List<Contrat> recuppererContrat() {
        return ContratRepo.findAll();
    }

    @Override
    public Set<Contrat> findContrats() {
        return new HashSet<>(ContratRepo.findAll());
    }

    @Override
    public Contrat recupererContratById(Long idContrat) {
        return ContratRepo.findById(idContrat).get();
    }
}
