package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.ParticipantBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TabIdParticipantToListParticipantConverter implements Converter<String[], List<ParticipantBo>>{

	
	private FilmService filmService;
		
	
	@Autowired
	public void setFilmService( FilmService filmService) {
		this.filmService = filmService;	
	}

	@Override
	public List<ParticipantBo> convert(String[] participantIds) {
		List<ParticipantBo> participants = new ArrayList<>();
		for(String participantIdStr: participantIds) {
			participants.add(filmService.getParticipantById(Integer.parseInt(participantIdStr)));
		}
		
		return participants;
	}

}
