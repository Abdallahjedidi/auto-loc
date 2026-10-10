package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Repositories.VehiculeRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehicule{
    private final VehiculeRepo VehiculeRepo;
    @Override
    public Vehicule ajouterVehicule(Vehicule pa) {
        return VehiculeRepo.save(pa);
    }

    @Override
    public void supprimerVehicule(Long idVehicule) {
        VehiculeRepo.deleteById(idVehicule);

    }

    @Override
    public List<Vehicule> recuppererVehicule() {
        return VehiculeRepo.findAll();
    }

    @Override
    public Set<Vehicule> findVehicules() {
        return new HashSet<>(VehiculeRepo.findAll());
    }

    @Override
    public Vehicule recupererVehiculeById(Long idVehicule) {
        return VehiculeRepo.findById(idVehicule).get();
    }
}
