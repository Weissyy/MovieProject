package com.cda.projet.service;

import java.util.List;
import java.util.Optional;

import com.cda.projet.entity.Celebrites;

public interface CelebritesService {

	Celebrites createCelebrites(Celebrites celebrites);
	void deleteCelebrites(long celebritesId);
	Celebrites updateCelebrites(long celebritesId, Celebrites celebrites);
	Optional<Celebrites> getCelebrites(long celebritesId);
	List<Celebrites> getAllCelebrites();
}
