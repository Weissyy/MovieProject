package com.cda.projet.service;

import java.util.List;
import java.util.Optional;

import com.cda.projet.entity.Utilisateurs;

public interface UtilisateursService {

	Utilisateurs createUtilisateurs(Utilisateurs utilisateurs);
	void deleteUtilisateurs(long utilisateursId);
	Utilisateurs updateUtilisateurs(long utilisateursId, Utilisateurs utilisateurs);
	Optional<Utilisateurs> getUtilisateurs(long utilisateursId);
	Utilisateurs findByPseudo(String pseudo);
	Utilisateurs findByEmail(String email);
	List<Utilisateurs> getAllUtilisateurs();
	Utilisateurs findByIdUtilisateur(long id);
}
