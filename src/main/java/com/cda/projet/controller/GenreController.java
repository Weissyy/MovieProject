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

import com.cda.projet.entity.Genre;
import com.cda.projet.service.GenreService;

@RestController
@RequestMapping("/api/genre")
public class GenreController {

	private GenreService genreService;
	
	public GenreController(GenreService genreService) {
		this.genreService = genreService;
	}
	@RolesAllowed("ADMIN")
	@PostMapping
	public Genre createGenre(@RequestBody Genre genre) {
		return genreService.createGenre(genre);
	}
	@RolesAllowed("ADMIN")
	@DeleteMapping("/{genreId}")
	public void deleteGenre(@PathVariable long genreId) {
		genreService.deleteGenre(genreId);
	}
	@RolesAllowed("ADMIN")
	@PutMapping("/{genreId}")
	public Genre updateGenre(@PathVariable long genreId, @RequestBody Genre genre) {
		return genreService.updateGenre(genreId, genre);
	}
	@RolesAllowed("USER")
	@GetMapping("/{genreId}")
	public Optional<Genre> getGenre(@PathVariable long genreId){
		return genreService.getGenre(genreId);
	}
	
	@GetMapping
	public List<Genre> getGenres(){
		return genreService.getGenres();
	}
}
