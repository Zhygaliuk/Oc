package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.ControlZoneDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.ControlZone;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.ControlZoneMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.ControlZoneService;

@CrossOrigin
@RequestMapping(value = "/control_zone")
@RestController
@AllArgsConstructor
public class ControlZoneControllerImpl extends AbstractControllerImpl<ControlZone, ControlZoneDto> {
    private final ControlZoneService controlZoneService;
    private final ControlZoneMapper controlZoneMapper;

    @Override
    public AbstractService<ControlZone> getService() {
        return controlZoneService;
    }

    @Override
    public AbstractMapper<ControlZone, ControlZoneDto> getMapper() {
        return controlZoneMapper;
    }
}
