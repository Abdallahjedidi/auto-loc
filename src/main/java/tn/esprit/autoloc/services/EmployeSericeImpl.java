package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Employe;
import tn.esprit.autoloc.Repositories.EmployeRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EmployeSericeImpl implements IEmploye{
    private final EmployeRepo EmployeRepo;
    @Override
    public Employe ajouterEmploye(Employe em) {
        return EmployeRepo.save(em);
    }

    @Override
    public void supprimerEmploye(Long idEmploye) {
        EmployeRepo.deleteById(idEmploye);

    }

    @Override
    public List<Employe> recuppererEmploye() {
        return EmployeRepo.findAll();
    }

    @Override
    public Set<Employe> findEmployes() {
        return new HashSet<>(EmployeRepo.findAll());
    }

    @Override
    public Employe recupererEmployeById(Long idEmploye) {
        return EmployeRepo.findById(idEmploye).get();
    }

}
