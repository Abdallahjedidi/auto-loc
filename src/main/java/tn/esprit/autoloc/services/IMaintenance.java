package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.Maintenance;

import java.util.List;
import java.util.Set;

public interface IMaintenance {
    Maintenance ajouterMaintenance (Maintenance  ma);
    void supprimerMaintenance (Long idMaintenance );
    List<Maintenance > recuppererMaintenance ();
    Set<Maintenance > findMaintenances();
    Maintenance  recupererMaintenanceById(Long idMaintenance );
}
