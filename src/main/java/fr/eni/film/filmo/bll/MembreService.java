package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bll.Erreur.ErreurMembre;
import fr.eni.film.filmo.bo.MembreBo;

import java.util.List;

public interface MembreService {
    MembreBo membre(int connexion) throws ErreurMembre;

    List<MembreBo> getMembres();
}
