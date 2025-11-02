package org.esprim.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.esprim.tpfoyer.entity.Chambre;
import org.esprim.tpfoyer.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //on a déclaré c'est une classe bean
@AllArgsConstructor //on peut utiliser @autowired

public class ChambreServiceImpl implements IChambreService {
    @Autowired //injection de dépendance
    ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retriveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retriveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
