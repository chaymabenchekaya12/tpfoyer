package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Bloc;
import org.esprim.tpfoyer.entity.Etudiant;
import org.esprim.tpfoyer.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EtudiantServiceImpl implements IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retriveAlletudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retriveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }
    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
