package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bll.Erreur.ErreurAvis;
import fr.eni.film.filmo.bo.AvisBo;


import java.util.List;
import java.util.Map;

public interface AvisService {
    public AvisBo avis(int avis) throws ErreurAvis;

    public List<AvisBo> getListeAvis();
    public Map<Integer, AvisBo> getMapAvis();

}
