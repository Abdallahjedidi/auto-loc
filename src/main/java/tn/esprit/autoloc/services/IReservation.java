package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entities.Reservation;

import java.util.List;
import java.util.Set;

public interface IReservation {
    Reservation ajouterReservation (Reservation  re);
    void supprimerReservation (Long idReservation );
    List<Reservation > recuppererReservation ();
    Set<Reservation > findReservations();
    Reservation  recupererReservationById(Long idReservation );
}
