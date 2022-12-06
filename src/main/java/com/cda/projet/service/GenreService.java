package com.cda.projet.service;

import java.util.List;
import java.util.Optional;

import com.cda.projet.entity.Genre;

public interface GenreService {

	Genre createGenre(Genre genre);
	void deleteGenre(long genreId);
	Genre updateGenre(long genreId, Genre genre);
	Optional<Genre> getGenre(long genreId);
	List<Genre> getGenres();
}
