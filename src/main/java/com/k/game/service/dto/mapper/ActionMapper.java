package com.k.game.service.dto.mapper;

import com.k.game.repository.model.Action;
import com.k.game.service.dto.ActionDto;
import org.mapstruct.Mapper;

@Mapper
public interface ActionMapper {

    Action actionDtoToAction(ActionDto actionDto);

}
