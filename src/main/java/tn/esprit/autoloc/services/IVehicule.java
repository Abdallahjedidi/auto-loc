package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.Vehicule;

import java.util.List;
import java.util.Set;

public interface IVehicule {
    Vehicule ajouterVehicule (Vehicule  ve);
    void supprimerVehicule (Long idVehicule );
    List<Vehicule > recuppererVehicule ();
    Set<Vehicule > findVehicules();
    Vehicule  recupererVehiculeById(Long idVehicule );
}
