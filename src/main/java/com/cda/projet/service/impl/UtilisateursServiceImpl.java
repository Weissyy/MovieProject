package com.cda.projet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cda.projet.entity.Utilisateurs;
import com.cda.projet.repository.UtilisateursRepository;
import com.cda.projet.service.UtilisateursService;

@Service
public class UtilisateursServiceImpl implements UtilisateursService {

	private UtilisateursRepository utilisateursRepository;
	
	public UtilisateursServiceImpl(UtilisateursRepository utilisateursRepository) {
		this.utilisateursRepository = utilisateursRepository;
	}
	
	public Utilisateurs createUtilisateurs(Utilisateurs utilisateurs) {
		return utilisateursRepository.save(utilisateurs);
	}
	
	public void deleteUtilisateurs(long utilisateursId) {
		utilisateursRepository.deleteById(utilisateursId);
	}
	
	public Utilisateurs updateUtilisateurs(long utilisateursId, Utilisateurs utilisateurs) {
		Utilisateurs u = utilisateursRepository.findById(utilisateursId).get();
		u.setNom(utilisateurs.getNom());
		u.setPrenom(utilisateurs.getPrenom());
		u.setPseudo(utilisateurs.getPseudo());
		u.setEmail(utilisateurs.getEmail());
		u.setMdp(utilisateurs.getMdp());
		u.setRole(utilisateurs.getRole());
		return utilisateursRepository.save(u);
	}
	
	public Optional<Utilisateurs> getUtilisateurs(long utilisateursId) {
		return utilisateursRepository.findById(utilisateursId);
	}
	
	public Utilisateurs findByPseudo(String pseudo) {
		return utilisateursRepository.findByPseudo(pseudo);
	}
	public Utilisateurs findByEmail(String email) {
		return utilisateursRepository.findByEmail(email);
	}
	
	public List<Utilisateurs> getAllUtilisateurs(){
		return (List<Utilisateurs>) utilisateursRepository.findAll();
	}
}
