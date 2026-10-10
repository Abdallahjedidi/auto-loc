package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Repositories.AgenceRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgence{
    private final AgenceRepo AgenceRepo;
    @Override
    public Agence ajouterAgence(Agence ag) {
        return AgenceRepo.save(ag);
    }

    @Override
    public void supprimerAgence(Long idAgence) {
        AgenceRepo.deleteById(idAgence);

    }

    @Override
    public List<Agence> recuppererAgence() {
        return AgenceRepo.findAll();
    }

    @Override
    public Set<Agence> findAgences() {
        return new HashSet<>(AgenceRepo.findAll());
    }

    @Override
    public Agence recupererAgenceById(Long idAgence) {
        return AgenceRepo.findById(idAgence).get();
    }
    
}
