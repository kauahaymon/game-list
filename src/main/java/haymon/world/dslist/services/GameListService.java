package haymon.world.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import haymon.world.dslist.dto.GameListDTO;
import haymon.world.dslist.entities.GameList;
import haymon.world.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional
	public List<GameListDTO> findAll() {
		List<GameList> gameLists = gameListRepository.findAll();
		return gameLists.stream().map(x -> new GameListDTO(x)).toList();
	}
}
