package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversite {
    List<Universite> retriveAllUniversites();

    Universite retriveUniversite(Long idUniversite);

    Universite addUniversite(Universite u);

    void removeUniversite(Long idUniversite);

    Universite modifyUniversite(Universite u);
}
