package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.*;

import java.util.List;
import java.util.Set;

public interface IEquipement {
    Equipement ajouterEquipement (Equipement  eq);
    void supprimerEquipement (Long idEquipement );
    List<Equipement > recuppererEquipement ();
    Set<Equipement > findEquipements();
    Equipement  recupererEquipementById(Long idEquipement );
}
