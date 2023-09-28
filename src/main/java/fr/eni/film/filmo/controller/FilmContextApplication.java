package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.GenreBo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmContextApplication {
    private FilmService filmService;
    private List<GenreBo> genres;

    @Autowired
    public FilmContextApplication(FilmService filmService){
        this.filmService =filmService;
        genres = filmService.getGenres();
    }
    public List<GenreBo> getGenres() {
        return genres;
    }
    public void setGenres(List<GenreBo> genres) {
        this.genres = genres;
    }

}
