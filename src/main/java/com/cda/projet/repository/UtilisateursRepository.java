package com.cda.projet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cda.projet.entity.Utilisateurs;

@Repository
public interface UtilisateursRepository extends CrudRepository<Utilisateurs, Long> {

	Utilisateurs findByPseudo(String pseudo);
	Utilisateurs findByEmail(String email);
}
