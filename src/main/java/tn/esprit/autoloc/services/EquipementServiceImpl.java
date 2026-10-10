package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Equipement;
import tn.esprit.autoloc.Repositories.EquipementRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipement{
    private final EquipementRepo EquipementRepo;
    @Override
    public Equipement ajouterEquipement(Equipement eq) {
        return EquipementRepo.save(eq);
    }

    @Override
    public void supprimerEquipement(Long idEquipement) {
        EquipementRepo.deleteById(idEquipement);

    }

    @Override
    public List<Equipement> recuppererEquipement() {
        return EquipementRepo.findAll();
    }

    @Override
    public Set<Equipement> findEquipements() {
        return new HashSet<>(EquipementRepo.findAll());
    }

    @Override
    public Equipement recupererEquipementById(Long idEquipement) {
        return EquipementRepo.findById(idEquipement).get();
    }
}
