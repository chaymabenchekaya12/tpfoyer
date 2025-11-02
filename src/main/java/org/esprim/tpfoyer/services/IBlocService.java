package org.esprim.tpfoyer.services;

import org.esprim.tpfoyer.entity.Bloc;


import java.util.List;

public interface IBlocService {
    public List<Bloc> retriveAllblocs();
    public  Bloc retriveBloc(Long idBloc);
    public  Bloc addBloc(Bloc b);
    public  void removeBloc(Long idBloc);
    public  Bloc modifyBloc(Bloc bloc);
}
