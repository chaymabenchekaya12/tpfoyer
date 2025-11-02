package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retriveAllFoyer();
    public Foyer retriveFoyer(Long idFoyer);
    public  Foyer addFoyer(Foyer f);
    public  void removeFoyer(Long idFoyer);
    public  Foyer modifyFoyer(Foyer foyer);
}
