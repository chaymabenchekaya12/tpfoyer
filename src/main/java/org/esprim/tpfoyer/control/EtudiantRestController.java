package org.esprim.tpfoyer.control;

import org.esprim.tpfoyer.entity.Bloc;
import org.esprim.tpfoyer.entity.Etudiant;
import org.esprim.tpfoyer.services.IBlocService;
import org.esprim.tpfoyer.services.IEtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EtudiantRestController {
    IEtudiantService etudiantService;

    // http://localhost:13660/tpfoyer/Etudiant/retrieve-all-etudiant

    @GetMapping("/retrieve-all-etudiant")
    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> listetudiants = etudiantService.retriveAlletudiants();
        return listetudiants;
    }
    // http://localhost:13660/tpfoyer/etudiant/retrieve-etudiant/{id-bloc}
    @GetMapping("/retriveEtudiant/{etudiant-id}")
    public Etudiant retriveEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        Etudiant etudiant = etudiantService.retriveEtudiant(idEtudiant);
        return etudiant;
    }
    // http://localhost:13660/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:13660/tpfoyer/etudiant/remove-etudiant/{etudiant-id}
// DELETE remove
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }

    // http://localhost:13660/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }
}
