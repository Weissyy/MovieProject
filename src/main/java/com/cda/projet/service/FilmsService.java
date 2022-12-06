package com.cda.projet.service;

import java.util.List;
import java.util.Optional;

import com.cda.projet.entity.Films;

public interface FilmsService {

	Films createFilms(Films films);
	void deleteFilms(long filmsId);
	Films updateFilms(long filmsId, Films films);
	Optional<Films> getFilms(long filmsId);
	List<Films> getAllFilms();
}
