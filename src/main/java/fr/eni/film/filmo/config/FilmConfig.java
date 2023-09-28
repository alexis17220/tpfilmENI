package fr.eni.film.filmo.config;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;

@Configuration
public class FilmConfig {
    @Bean
    @ApplicationScope
    public List<FilmBo> films(FilmService service) {
        return service.getListeFilms();
    }
}
