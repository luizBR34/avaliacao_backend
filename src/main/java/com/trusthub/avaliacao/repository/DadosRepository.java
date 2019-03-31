package com.trusthub.avaliacao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trusthub.avaliacao.model.Dados;

@Repository
public interface DadosRepository extends CrudRepository<Dados, String> {
	
	Dados findBycodigo(long codigo);
}
