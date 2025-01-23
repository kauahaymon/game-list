package haymon.world.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import haymon.world.dslist.dto.GameListDTO;
import haymon.world.dslist.dto.GameMinDTO;
import haymon.world.dslist.dto.ReplacementDTO;
import haymon.world.dslist.services.GameListService;
import haymon.world.dslist.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> getAllLists() {
		List<GameListDTO> lists = gameListService.findAll();
		return lists;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> getGamesByList(@PathVariable Long listId) {
		List<GameMinDTO> lists = gameService.findByList(listId);
		return lists;
	}

	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}
