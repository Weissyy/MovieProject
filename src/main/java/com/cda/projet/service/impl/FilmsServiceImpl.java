package com.cda.projet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cda.projet.entity.Films;
import com.cda.projet.repository.FilmsRepository;
import com.cda.projet.service.FilmsService;

@Service
public class FilmsServiceImpl implements FilmsService {

	private FilmsRepository filmsRepository;
	
	public FilmsServiceImpl(FilmsRepository filmsRepository) {
		this.filmsRepository = filmsRepository;
	}
	
	public Films createFilms(Films films) {
		return filmsRepository.save(films);
	}
	
	public void deleteFilms(long filmsId) {
		filmsRepository.deleteById(filmsId);
	}
	
	public Films updateFilms(long filmsId, Films films) {
		Films f = filmsRepository.findById(filmsId).get();
		f.setAffiche(films.getAffiche());
		f.setAnnee(films.getAnnee());
		f.setDuree(films.getDuree());
		f.setSynopsis(films.getSynopsis());
		f.setTitre(films.getTitre());
		return filmsRepository.save(f);
	}
	
	public Optional<Films> getFilms(long filmsId) {
		return filmsRepository.findById(filmsId);
	}
	
	public List<Films> getAllFilms(){
		return (List<Films>) filmsRepository.findAll();
	}
}
