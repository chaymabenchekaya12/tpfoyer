package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Foyer;
import org.esprim.tpfoyer.repository.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoyerServiceImpl implements IFoyerService {

    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retriveAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retriveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer modifyFoyer(Foyer f) {
        return foyerRepository.save(f);
    }
}
