package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.ParticipantBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToParticipantConverter implements Converter<String, ParticipantBo> {

	private FilmService filmService;
	
	@Autowired
	public void setFilmService( FilmService filmService) {
		this.filmService = filmService;
	}

	
	@Override
	public ParticipantBo convert(String source) {
		Integer idParticipant = Integer.parseInt(source);
		return filmService.getParticipantById(idParticipant);
	}

}
