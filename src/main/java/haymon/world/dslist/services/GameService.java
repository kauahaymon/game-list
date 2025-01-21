package haymon.world.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import haymon.world.dslist.dto.GameDTO;
import haymon.world.dslist.entities.Game;
import haymon.world.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public List<Game> findAll() {
		return gameRepository.findAll();
	}
	
	@Transactional
	public GameDTO findById(Long id) {
		Game game = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(game);
		return dto;
	}
}
