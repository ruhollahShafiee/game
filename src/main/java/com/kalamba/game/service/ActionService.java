package com.kalamba.game.service;

import com.kalamba.game.repository.model.Action;
import com.kalamba.game.repository.model.Game;
import com.kalamba.game.repository.model.User;
import com.kalamba.game.service.dto.ActionIncomingDto;
import com.kalamba.game.repository.ActionRepository;
import com.kalamba.game.repository.GameRepository;
import com.kalamba.game.repository.UserRepository;
import com.kalamba.game.service.dto.mapper.ActionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class ActionService {

    @Autowired
    private ActionRepository actionRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ActionMapper actionMapper;


    public void add(ActionIncomingDto actionIncomingDto) {

        Optional<User> userOptional=userRepository.findById(actionIncomingDto.getUserId());
        Optional<Game> gameOptional =gameRepository.findById(actionIncomingDto.getGameId());

        if(!userOptional.isPresent() )
            throw new NoSuchElementException("No value present for userId");
        if(!gameOptional.isPresent() )
            throw new NoSuchElementException("No value present for gameId");

        Action action=actionMapper.actionDtoToAction(actionIncomingDto.getAction());
        action.setGame(gameOptional.get());
        action.setUser(userOptional.get());
        actionRepository.save(action);

    }


}
