package com.k.game.service.dto;

import lombok.Data;

@Data
public class ActionIncomingDto {

    private Integer userId;
    private Integer gameId;
    private ActionDto action;
}
