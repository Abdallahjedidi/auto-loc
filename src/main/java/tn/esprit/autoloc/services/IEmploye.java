package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.*;

import java.util.List;
import java.util.Set;

public interface IEmploye {

    Employe ajouterEmploye(Employe em);
    void supprimerEmploye(Long idEmploye);
    List<Employe> recuppererEmploye();
    Set<Employe> findEmployes();
    Employe recupererEmployeById(Long idEmploye);
}
