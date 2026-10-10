package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.Client;

import java.util.*;

public interface IClient {
    Client ajouterClient(Client cl);
    void supprimerClient(Long idClient);
    List<Client> recuppererClient();
    Set<Client> findClients();
    Client recupererClientById(Long idClient);
}
