package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retriveAllReservations();

    Reservation retriveReservation(Long idReservation);

    Reservation addReservation(Reservation r);

    void removeReservation(Long idReservation);

    Reservation modifyReservation(Reservation r);
}
