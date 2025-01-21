package haymon.world.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import haymon.world.dslist.dto.GameMinDTO;
import haymon.world.dslist.entities.Game;
import haymon.world.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> getAllGames() {
		List<Game> games = gameService.findAll();
		List<GameMinDTO> dto = games.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
