package com.cda.projet.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cda.projet.entity.Films;
import com.cda.projet.service.FilmsService;

@RestController
@RequestMapping("/api/films")
public class FilmsController {

	private FilmsService filmsService;
	
	public FilmsController(FilmsService filmsService) {
		this.filmsService = filmsService;
	}
	@RolesAllowed("ADMIN")
	@PostMapping
	public Films createFilms(@RequestBody Films films) {
		return filmsService.createFilms(films);
	}
	@RolesAllowed("ADMIN")
	@DeleteMapping("/{filmsId}")
	public void deleteFilms(@PathVariable long filmsId) {
		filmsService.deleteFilms(filmsId);
	}
	@RolesAllowed("ADMIN")
	@PutMapping("/{filmsId}")
	public Films updateFilms(@PathVariable long filmsId, @RequestBody Films films) {
		return filmsService.updateFilms(filmsId, films);
	}
	@RolesAllowed("USER")
	@GetMapping("/{filmsId}")
	public Optional<Films> getFilms(@PathVariable long filmsId){
		return filmsService.getFilms(filmsId);
	}
	
	@GetMapping
	public List<Films> getAllFilms(){
		return filmsService.getAllFilms();
	}
}
