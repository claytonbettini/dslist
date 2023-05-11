package com.bettini.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bettini.dslist.dto.GameMinDTO;
import com.bettini.dslist.entities.Game;
import com.bettini.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.parallelStream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
}
