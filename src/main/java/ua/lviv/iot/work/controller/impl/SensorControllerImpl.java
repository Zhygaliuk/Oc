package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.SensorDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.Sensor;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.SensorMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.SensorService;

@CrossOrigin
@RequestMapping(value = "/sensor")
@RestController
@AllArgsConstructor
public class SensorControllerImpl extends AbstractControllerImpl<Sensor, SensorDto> {
    private final SensorService sensorService;
    private final SensorMapper patrolMapper;

    @Override
    public AbstractService<Sensor> getService() {
        return sensorService;
    }

    @Override
    public AbstractMapper<Sensor, SensorDto> getMapper() {
        return patrolMapper;
    }
}
