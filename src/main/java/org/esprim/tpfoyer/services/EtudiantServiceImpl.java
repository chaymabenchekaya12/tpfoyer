package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EtudiantServiceImpl implements IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;
}
