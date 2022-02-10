package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.OperatorDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.Operator;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.OperatorMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.OperatorService;

@CrossOrigin
@RequestMapping(value = "/operator")
@RestController
@AllArgsConstructor
public class OperatorControllerImpl extends AbstractControllerImpl<Operator, OperatorDto> {
    private final OperatorService operatorService;
    private final OperatorMapper operatorMapper;

    @Override
    public AbstractService<Operator> getService() {
        return operatorService;
    }

    @Override
    public AbstractMapper<Operator, OperatorDto> getMapper() {
        return operatorMapper;
    }
}
