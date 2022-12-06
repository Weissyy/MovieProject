package com.cda.projet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="films")
public class Films {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_film")
	private long idFilm;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="affiche")
	private String affiche;
	
	@Column(name="annee")
	private int annee;
	
	@Column(name="duree")
	private int duree;
	
	@Column(name="synopsis")
	private String synopsis;

	public long getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(long idFilm) {
		this.idFilm = idFilm;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAffiche() {
		return affiche;
	}

	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	
}
