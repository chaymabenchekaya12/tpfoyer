package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Bloc;
import org.esprim.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retriveAlletudiants();
    public  Etudiant retriveEtudiant(Long idEtudiant);
    public  Etudiant addEtudiant(Etudiant e);
    public  void removeEtudiant(Long idEtudiant);
    public  Etudiant modifyEtudiant(Etudiant etudiant);
}
