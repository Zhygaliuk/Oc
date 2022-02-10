package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.PatrolDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.Patrol;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.PatrolMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.PatrolService;

@CrossOrigin
@RequestMapping(value = "/patrol")
@RestController
@AllArgsConstructor
public class PatrolControllerImpl extends AbstractControllerImpl<Patrol, PatrolDto> {
    private final PatrolService patrolService;
    private final PatrolMapper patrolMapper;

    @Override
    public AbstractService<Patrol> getService() {
        return patrolService;
    }

    @Override
    public AbstractMapper<Patrol, PatrolDto> getMapper() {
        return patrolMapper;
    }
}
