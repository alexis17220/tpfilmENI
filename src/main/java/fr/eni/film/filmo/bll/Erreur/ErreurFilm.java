package fr.eni.film.filmo.bll.Erreur;

public class ErreurFilm extends Exception{

    public ErreurFilm(){

    }

    public ErreurFilm(String message){
        super(message);
    }
}
