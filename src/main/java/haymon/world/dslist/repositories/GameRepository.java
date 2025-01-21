package haymon.world.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import haymon.world.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
