package com.cda.projet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cda.projet.entity.Celebrites;
import com.cda.projet.repository.CelebritesRepository;
import com.cda.projet.service.CelebritesService;

@Service
public class CelebritesServiceImpl implements CelebritesService{

	private CelebritesRepository celebritesRepository;
	
	public CelebritesServiceImpl(CelebritesRepository celebritesRepository) {
		this.celebritesRepository = celebritesRepository;
	}
	
	public Celebrites createCelebrites(Celebrites celebrites) {
		return celebritesRepository.save(celebrites);
	}
	
	public void deleteCelebrites(long celebritesId) {
		celebritesRepository.deleteById(celebritesId);
	}
	
	public Celebrites updateCelebrites(long celebritesId, Celebrites celebrites) {
		Celebrites c = celebritesRepository.findById(celebritesId).get();
		c.setNom(celebrites.getNom());
		c.setPrenom(celebrites.getPrenom());
		c.setNomScene(celebrites.getNomScene());
		c.setBiographie(celebrites.getBiographie());
		c.setStatut(celebrites.getStatut());
		return celebritesRepository.save(c);
	}
	
	public Optional<Celebrites> getCelebrites(long celebritesId) {
		return celebritesRepository.findById(celebritesId);
	}
	
	public List<Celebrites> getAllCelebrites() {
		return (List<Celebrites>) celebritesRepository.findAll();
	}
}
