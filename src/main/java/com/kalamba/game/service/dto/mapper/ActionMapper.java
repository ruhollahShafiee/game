package com.kalamba.game.service.dto.mapper;

import com.kalamba.game.service.dto.ActionDto;
import com.kalamba.game.repository.model.Action;
import org.mapstruct.Mapper;

@Mapper
public interface ActionMapper {

    Action actionDtoToAction(ActionDto actionDto);

}
