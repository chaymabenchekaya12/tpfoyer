package org.esprim.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.esprim.tpfoyer.entity.Universite;
import org.esprim.tpfoyer.services.IUniversite;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

   IUniversite universiteService;

    // GET all universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getAllUniversites() {
        return universiteService.retriveAllUniversites();
    }

    // GET universite by ID
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long idUniversite) {
        return universiteService.retriveUniversite(idUniversite);
    }

    // POST add universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    // DELETE remove universite
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }

    // PUT modify universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        return universiteService.modifyUniversite(u);
    }
}
