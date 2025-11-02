package org.esprim.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.esprim.tpfoyer.entity.Bloc;

import org.esprim.tpfoyer.repository.BlocRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //on a déclaré c'est une classe bean
@AllArgsConstructor //on peut utiliser @autowired

public class BlocServiceImpl implements IBlocService {
    @Autowired
    BlocRepository blocRepository;

    @Override
    public List<Bloc> retriveAllblocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retriveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }
    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}