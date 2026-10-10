package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Reservation;
import tn.esprit.autoloc.Repositories.ReservationRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservation{
    private final ReservationRepo ReservationRepo;
    @Override
    public Reservation ajouterReservation(Reservation re) {
        return ReservationRepo.save(re);
    }

    @Override
    public void supprimerReservation(Long idReservation) {
        ReservationRepo.deleteById(idReservation);

    }

    @Override
    public List<Reservation> recuppererReservation() {
        return ReservationRepo.findAll();
    }

    @Override
    public Set<Reservation> findReservations() {
        return new HashSet<>(ReservationRepo.findAll());
    }

    @Override
    public Reservation recupererReservationById(Long idReservation) {
        return ReservationRepo.findById(idReservation).get();
    }
}
