package fr.eni.film.filmo.bll.implementation;

import fr.eni.film.filmo.bll.Erreur.ErreurMembre;
import fr.eni.film.filmo.bll.MembreService;
import fr.eni.film.filmo.bo.MembreBo;

import java.util.ArrayList;
import java.util.List;

public class MembreServiceImpl implements MembreService {
    private List<MembreBo> membres;
    public MembreBo membre(int choix) throws ErreurMembre {
        return null;
    }



    MembreBo potter = new MembreBo(1, "Potter", "Harry", "harPot", "admin", true);
    MembreBo none = new MembreBo(2, "None", "Bergere", "bernon", "b54fr", false);
    MembreBo sully = new MembreBo(3, "Avatar", "Sully", "AvaCid", "eauCha45", false);

    @Override
    public List<MembreBo> getMembres() {
        if(membres==null) {
            membres = new ArrayList<MembreBo>();
            membres.add(potter);
            membres.add(none);
            membres.add(sully);

        }
        return membres;
    }


}
