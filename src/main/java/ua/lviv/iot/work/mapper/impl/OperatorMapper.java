package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.OperatorDto;
import ua.lviv.iot.work.Domain.Operator;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class OperatorMapper implements AbstractMapper<Operator, OperatorDto> {

    @Override
    public OperatorDto map(Operator operator) {
        OperatorDto.OperatorDtoBuilder operatorDtoBuilder = OperatorDto.builder();
        operatorDtoBuilder.name(operator.getName());
        operatorDtoBuilder.id(operator.getId());
        operatorDtoBuilder.surname(operator.getSurname());
        operatorDtoBuilder.phone_number(operator.getPhone_number());
        operatorDtoBuilder.CT_number(operator.getCT_number());
        operatorDtoBuilder.patrol_head(operator.getPatrol_head());
        return operatorDtoBuilder.build();
    }
}