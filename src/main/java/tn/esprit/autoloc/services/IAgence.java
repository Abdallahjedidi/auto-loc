package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.*;

import java.util.List;
import java.util.Set;

public interface IAgence {
    Agence ajouterAgence(Agence ag);
    void supprimerAgence(Long idAgence);
    List<Agence> recuppererAgence();
    Set<Agence> findAgences();
    Agence recupererAgenceById(Long idAgence);
}
