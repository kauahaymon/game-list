package haymon.world.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import haymon.world.dslist.dto.GameListDTO;
import haymon.world.dslist.services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> getAllLists() {
		List<GameListDTO> lists = gameListService.findAll();
		return lists;
	}
}
