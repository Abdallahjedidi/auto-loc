package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.Contrat;

import java.util.List;
import java.util.Set;

public interface IContrat {
    Contrat ajouterContrat(Contrat co);
    void supprimerContrat(Long idContrat);
    List<Contrat> recuppererContrat();
    Set<Contrat> findContrats();
    Contrat recupererContratById(Long idContrat);
}
