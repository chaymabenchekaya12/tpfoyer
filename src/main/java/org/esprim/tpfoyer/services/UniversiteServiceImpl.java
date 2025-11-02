package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Universite;
import org.esprim.tpfoyer.repository.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversite {

    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retriveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retriveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite modifyUniversite(Universite u) {
        return universiteRepository.save(u);
    }
}
