package com.cda.projet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genre")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_genre")
	private long idGenre;
	
	@Column(name="nom")
	private String nom;

	public long getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(long idGenre) {
		this.idGenre = idGenre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
