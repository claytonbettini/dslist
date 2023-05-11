package com.bettini.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bettini.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
