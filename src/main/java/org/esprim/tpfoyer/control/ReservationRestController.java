package org.esprim.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.esprim.tpfoyer.entity.Reservation;
import org.esprim.tpfoyer.services.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    IReservationService reservationService;

    // GET all reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getAllReservations() {
        return reservationService.retriveAllReservations();
    }

    // GET reservation by ID
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long idReservation) {
        return reservationService.retriveReservation(idReservation);
    }

    // POST add reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    // DELETE remove reservation
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long idReservation) {
        reservationService.removeReservation(idReservation);
    }

    // PUT modify reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        return reservationService.modifyReservation(r);
    }
}
