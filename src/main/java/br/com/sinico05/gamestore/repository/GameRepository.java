package br.com.sinico05.gamestore.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.sinico05.gamestore.model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{}
