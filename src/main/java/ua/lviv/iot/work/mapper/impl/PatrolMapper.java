package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.PatrolDto;
import ua.lviv.iot.work.Domain.Patrol;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class PatrolMapper implements AbstractMapper<Patrol, PatrolDto> {

    @Override
    public PatrolDto map(Patrol patrol) {
        PatrolDto.PatrolDtoBuilder patrolDtoBuilder = PatrolDto.builder();
        patrolDtoBuilder.name(patrol.getName());
        patrolDtoBuilder.id(patrol.getId());
        patrolDtoBuilder.operators_number(patrol.getOperators_number());
        patrolDtoBuilder.head_id(patrol.getHead_id());
        return patrolDtoBuilder.build();
    }
}
