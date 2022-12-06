package com.cda.projet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="celebrites")
public class Celebrites {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_celebrite")
	private long idCelebrite;
	
	@Column(name="nom_scene")
	private String nomScene;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="biographie")
	private String biographie;
	
	@Column(name="statut")
	private String statut;

	public long getIdCelebrite() {
		return idCelebrite;
	}

	public void setIdCelebrite(long idCelebrite) {
		this.idCelebrite = idCelebrite;
	}

	public String getNomScene() {
		return nomScene;
	}

	public void setNomScene(String nomScene) {
		this.nomScene = nomScene;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getBiographie() {
		return biographie;
	}

	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
