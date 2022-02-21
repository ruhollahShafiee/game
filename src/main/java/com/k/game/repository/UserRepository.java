package com.k.game.repository;


import com.k.game.repository.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;

@Component
@Transactional
public interface UserRepository extends CrudRepository<User,Integer> {
}
