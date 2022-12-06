package com.cda.projet.repository;

import org.springframework.data.repository.CrudRepository;

import com.cda.projet.entity.Films;

public interface FilmsRepository extends CrudRepository<Films, Long> {

}
