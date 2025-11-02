package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.repository.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoyerServiceImpl implements IFoyerService {
    @Autowired
    FoyerRepository FoyerRepository;
}
