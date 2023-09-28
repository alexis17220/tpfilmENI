package fr.eni.film.filmo.bll.Erreur;

public class ErreurAvis extends Exception {
    public ErreurAvis(){

    }

    public ErreurAvis(String message){
        super(message);
    }
}
