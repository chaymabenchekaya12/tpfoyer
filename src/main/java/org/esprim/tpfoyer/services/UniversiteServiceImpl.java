package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UniversiteServiceImpl {
    @Autowired
    private ReservationRepository reservationRepository;
}
