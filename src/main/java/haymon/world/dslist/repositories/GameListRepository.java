package haymon.world.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import haymon.world.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}