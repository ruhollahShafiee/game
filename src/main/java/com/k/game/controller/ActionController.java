package com.k.game.controller;


import com.k.game.controller.response.ResponseTemplate;
import com.k.game.service.ActionService;
import com.k.game.service.dto.ActionIncomingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/action")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody ActionIncomingDto action) {

        actionService.add(action);

        return new ResponseTemplate(Instant.now(), true, HttpStatus.OK, null, "Operate successfully").build();
    }

}
