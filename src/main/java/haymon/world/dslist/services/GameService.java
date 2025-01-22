package haymon.world.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import haymon.world.dslist.dto.GameDTO;
import haymon.world.dslist.dto.GameMinDTO;
import haymon.world.dslist.entities.Game;
import haymon.world.dslist.projections.GameMinProjection;
import haymon.world.dslist.repositories.GameListRepository;
import haymon.world.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		return games.stream().map(GameMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game game = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(game);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> games = gameListRepository.searhByList(listId);
		return games.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
