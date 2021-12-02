package com.kalamba.game.repository;


import com.kalamba.game.repository.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;

@Component
@Transactional
public interface UserRepository extends CrudRepository<User,Integer> {
}
