package fr.eni.film.filmo.bll.implementation;



import java.util.ArrayList;
import java.util.List;

import fr.eni.film.filmo.bo.GenreBo;
import fr.eni.film.filmo.bo.ParticipantBo;
import org.springframework.stereotype.Service;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;

@Service
public class FilmServiceImpl implements FilmService{

    ParticipantBo archainbaud = new ParticipantBo(0, "Wilder", "Billy");
    ParticipantBo spielberg = new ParticipantBo(1, "Spielberg", "Steven");
    ParticipantBo patWelsh = new ParticipantBo(2, "Welsh", "Pat");
    ParticipantBo henryThomas = new ParticipantBo(3, "Thomas", "Henry");
    ParticipantBo marylin = new ParticipantBo(4, "Monroe", "Marylin");
    ParticipantBo tony = new ParticipantBo(5, "Curtis", "Tony");
    ParticipantBo jack = new ParticipantBo(6, "Lemmon", "Jack");
    ParticipantBo iti = new ParticipantBo(7, "Ti", "i");
    ParticipantBo shirley = new ParticipantBo(8, "Shirley", "MacLane");
    private List<FilmBo> films;

    private List<GenreBo> genres;

    private List<ParticipantBo> participants;


    GenreBo comedie = new GenreBo(0, "comedie");
    GenreBo scienceFiction = new GenreBo(1, "science fiction");

    int compteurFilm = 2;

    @Override
    public List<FilmBo> getListeFilms() {
        if(films==null) {



            FilmBo someLikeItHot = new FilmBo(0, "Some like it hot", 1939, archainbaud, 180, comedie, "bla bla bla");
            someLikeItHot.addActeur(marylin);
            someLikeItHot.addActeur(tony);
            someLikeItHot.addActeur(jack);

            FilmBo et = new FilmBo(1, "ET", 1982, spielberg, 180, scienceFiction,"bla bla bla");
            et.addActeur(patWelsh);
            et.addActeur(iti);

            films = new ArrayList<FilmBo>();
            films.add(someLikeItHot);
            films.add(et);

        }

        return films;
    }

    @Override
    public FilmBo getFilmById(int id) {

        for(FilmBo f: films) {
            if(f.getId()==id) {
                return f;
            }
        }

        return null;
    }

    @Override
    public List<GenreBo> getGenres() {
        if(genres==null) {
            genres = new ArrayList<GenreBo>();
            genres.add(comedie);
            genres.add(scienceFiction);

        }
        return genres;
    }

    @Override
    public List<ParticipantBo> getParticipant() {
        if(participants==null) {
            participants = new ArrayList<ParticipantBo>();
            participants.add(archainbaud);
            participants.add(spielberg);
            participants.add(patWelsh);
            participants.add(henryThomas);
            participants.add(marylin);
            participants.add(tony);
            participants.add(jack);
            participants.add(shirley);
        }
        return participants;
    }

    @Override
    public GenreBo getGenreById(int genreId) {
        for(GenreBo g: genres) {
            if(genreId==g.getId()) {
                return g;
            }
        }
        return null;
    }
    @Override
    public ParticipantBo getParticipantById(int realisateurId) {
        for(ParticipantBo p: participants) {
            if(realisateurId==p.getId()) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void ajouterFilm(FilmBo film) {
        film.setId(compteurFilm++);
        films.add(film);

    }
}
