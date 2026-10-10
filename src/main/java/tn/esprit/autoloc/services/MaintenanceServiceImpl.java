package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Repositories.MaintenanceRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenance{
    private final MaintenanceRepo MaintenanceRepo;
    @Override
    public Maintenance ajouterMaintenance(Maintenance ma) {
        return MaintenanceRepo.save(ma);
    }

    @Override
    public void supprimerMaintenance(Long idMaintenance) {
        MaintenanceRepo.deleteById(idMaintenance);

    }

    @Override
    public List<Maintenance> recuppererMaintenance() {
        return MaintenanceRepo.findAll();
    }

    @Override
    public Set<Maintenance> findMaintenances() {
        return new HashSet<>(MaintenanceRepo.findAll());
    }

    @Override
    public Maintenance recupererMaintenanceById(Long idMaintenance) {
        return MaintenanceRepo.findById(idMaintenance).get();
    }
}
