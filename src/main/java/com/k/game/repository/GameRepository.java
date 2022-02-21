package com.k.game.repository;

import com.k.game.repository.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;

@Component
@Transactional
public interface GameRepository extends CrudRepository<Game, Integer> {

}
