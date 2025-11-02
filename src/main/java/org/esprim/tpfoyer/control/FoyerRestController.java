package org.esprim.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.esprim.tpfoyer.entity.Foyer;
import org.esprim.tpfoyer.services.IFoyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    IFoyerService foyerService;

    // GET all foyers
    // http://localhost:13660/tpfoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getAllFoyers() {
        return foyerService.retriveAllFoyer();
    }

    // GET foyer by ID
    // http://localhost:13660/tpfoyer/foyer/retrieve-foyer/{foyer-id}
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long idFoyer) {
        return foyerService.retriveFoyer(idFoyer);
    }

    // POST add foyer
    // http://localhost:13660/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    // DELETE remove foyer
    // http://localhost:13660/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }

    // PUT modify foyer
    // http://localhost:13660/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        return foyerService.modifyFoyer(f);
    }
}
