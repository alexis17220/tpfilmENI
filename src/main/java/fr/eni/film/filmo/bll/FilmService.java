package fr.eni.film.filmo.bll;

import java.util.List;
import java.util.Map;

import fr.eni.film.filmo.bo.GenreBo;
import fr.eni.film.filmo.bo.ParticipantBo;

import fr.eni.film.filmo.bo.FilmBo;

public interface FilmService {



    List<FilmBo> getListeFilms();

    FilmBo getFilmById(int id);
    List<GenreBo> getGenres();

    List<ParticipantBo> getParticipant();

    GenreBo getGenreById(int genreId);

    ParticipantBo getParticipantById(int idParticipant);

    void ajouterFilm(FilmBo film);

}
