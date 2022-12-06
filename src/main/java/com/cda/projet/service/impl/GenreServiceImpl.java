package com.cda.projet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cda.projet.entity.Genre;
import com.cda.projet.repository.GenreRepository;
import com.cda.projet.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	private GenreRepository genreRepository;
	
	public GenreServiceImpl(GenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}
	
	public Genre createGenre(Genre genre) {
		return genreRepository.save(genre);
	}
	
	public void deleteGenre(long genreId) {
		genreRepository.deleteById(genreId);
	}
	
	public Genre updateGenre(long genreId, Genre genre) {
		Genre g = genreRepository.findById(genreId).get();
		g.setNom(genre.getNom());
		return genreRepository.save(g);
	}
	
	public Optional<Genre> getGenre(long genreId) {
		return genreRepository.findById(genreId);
	}
	
	public List<Genre> getGenres(){
		return (List<Genre>) genreRepository.findAll();
	}
}
