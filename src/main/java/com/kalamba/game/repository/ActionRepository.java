package com.kalamba.game.repository;

import com.kalamba.game.repository.model.Action;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;


@Component
@Transactional
public interface ActionRepository extends CrudRepository<Action,Integer> {

}
