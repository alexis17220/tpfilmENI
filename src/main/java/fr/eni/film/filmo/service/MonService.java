package fr.eni.film.filmo.service;

import fr.eni.film.filmo.repository.FilmRepo;

public class MonService {

	private FilmRepo filmRepo;
	
	public MonService(FilmRepo filmsRepo) {
		this.filmRepo = filmsRepo;
	}
	
	public void maMethodeMetier() {
		
	}
	
}
