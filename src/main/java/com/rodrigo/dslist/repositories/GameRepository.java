package com.rodrigo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
