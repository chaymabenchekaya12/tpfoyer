package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.repository.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    BlocRepository blocRepository;
}
