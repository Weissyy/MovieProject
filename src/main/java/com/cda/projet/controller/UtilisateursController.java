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

import com.cda.projet.entity.Utilisateurs;
import com.cda.projet.service.UtilisateursService;

@RestController
@RequestMapping("/api/user")
public class UtilisateursController {

	private UtilisateursService utilisateursService;
	
	public UtilisateursController(UtilisateursService utilisateursService) {
		this.utilisateursService = utilisateursService;
	}
	
	@PostMapping
	public Utilisateurs createUtilisateurs(@RequestBody Utilisateurs utilisateurs) {
		return utilisateursService.createUtilisateurs(utilisateurs);
	}
	@RolesAllowed("ADMIN")
	@DeleteMapping("/{utilisateursId}")
	public void deleteUtilisateurs(@PathVariable long utilisateursId) {
		utilisateursService.deleteUtilisateurs(utilisateursId);
	}
	@RolesAllowed("ADMIN")
	@PutMapping("/{utilisateursId}")
	public Utilisateurs updateUtilisateurs(@PathVariable long utilisateursId, @RequestBody Utilisateurs utilisateurs) {
		return utilisateursService.updateUtilisateurs(utilisateursId, utilisateurs);
	}
	@RolesAllowed("USER")
	@GetMapping("/{utilisateursId}")
	public Optional<Utilisateurs> getUtilisateurs(@PathVariable long utilisateursId){
		return utilisateursService.getUtilisateurs(utilisateursId);
	}
	@RolesAllowed("USER")
	@GetMapping
	public List<Utilisateurs> getAllUtilisateurs(){
		return utilisateursService.getAllUtilisateurs();
	}
	@RolesAllowed("USER")
	@GetMapping("/mail/{mail}")
	public Utilisateurs getUtilisateursByMail(@PathVariable String mail){
		return utilisateursService.findByEmail(mail);
	}
	@RolesAllowed("USER")
	@GetMapping("/pseudo/{pseudo}")
	public Utilisateurs getUtilisateursByPseudo(@PathVariable String pseudo){
		return utilisateursService.findByPseudo(pseudo);
	}
}
