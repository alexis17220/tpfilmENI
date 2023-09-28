package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.Erreur.ErreurFilm;
import fr.eni.film.filmo.bll.Erreur.ErreurMembre;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GestionErreur {
    @ExceptionHandler(ErreurFilm.class)
    public String  handleFilmErreur(Exception e, Model modele) {
        modele.addAttribute("message", e.getMessage());
        return "erreur";
    }

    @ExceptionHandler(ErreurMembre.class)
    public String  handleMembreErreur(Exception e, Model modele) {
        modele.addAttribute("message", e.getMessage());
        return "erreur";
    }

}
