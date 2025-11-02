package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Reservation;
import org.esprim.tpfoyer.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements  IReservationService{
    @Autowired
    ReservationRepository reservationRepository;


    @Override
    public List<Reservation> retriveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retriveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation modifyReservation(Reservation r) {
        return reservationRepository.save(r);
    }
}
