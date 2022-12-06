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

import com.cda.projet.entity.Celebrites;
import com.cda.projet.service.CelebritesService;

@RestController
@RequestMapping("/api/celebrites")
public class CelebritesController {
	
	private CelebritesService celebritesService;
	
	public CelebritesController(CelebritesService celebritesService) {
		this.celebritesService = celebritesService;
	}
	@RolesAllowed("ADMIN")
	@PostMapping
	public Celebrites createCelebrites(@RequestBody Celebrites celebrites) {
		return celebritesService.createCelebrites(celebrites);
	}
	
	@RolesAllowed("ADMIN")
	@DeleteMapping("/{celebritesId}")
	public void deleteCelebrites(@PathVariable long celebritesId) {
		celebritesService.deleteCelebrites(celebritesId);
	}
	@RolesAllowed("ADMIN")
	@PutMapping("/{celebritesId}")
	public Celebrites updateCelebrites(@PathVariable long celebritesId, @RequestBody Celebrites celebrites) {
		return celebritesService.updateCelebrites(celebritesId, celebrites);
	}
	@RolesAllowed("USER")
	@GetMapping("/{celebritesId}")
	public Optional<Celebrites> getCelebrites(@PathVariable long celebritesId){
		return celebritesService.getCelebrites(celebritesId);
	}
	
	@GetMapping
	public List<Celebrites> getAllCelebrites(){
		return celebritesService.getAllCelebrites();
	}
}
