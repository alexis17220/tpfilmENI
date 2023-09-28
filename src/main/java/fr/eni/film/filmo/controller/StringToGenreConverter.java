package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.GenreBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class StringToGenreConverter implements Converter<String, GenreBo> {

    private FilmService filmService;

    @Autowired
    public void setFilmService( FilmService filmService) {
        this.filmService = filmService;
    }

    @Override
    public GenreBo convert(String genreId) {
        // TODO Auto-generated method stub
        Integer id = Integer.parseInt(genreId);
        return filmService.getGenreById(id);
    }

}
