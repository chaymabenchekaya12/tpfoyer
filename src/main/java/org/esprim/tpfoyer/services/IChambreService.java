package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retriveAllChambre();
    public  Chambre retriveChambre(Long chambreId);
    public  Chambre addChambre(Chambre c);
    public  void removeChambre(Long chambreId);
    public  Chambre modifyChambre(Chambre chambre);
}
