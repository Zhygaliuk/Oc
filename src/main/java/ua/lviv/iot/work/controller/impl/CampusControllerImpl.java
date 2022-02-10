package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.CampusDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.Campus;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.CampusMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.CampusService;

@CrossOrigin
@RequestMapping(value = "/campus")
@RestController
@AllArgsConstructor
public class CampusControllerImpl extends AbstractControllerImpl<Campus, CampusDto> {
    private final CampusService campusService;
    private final CampusMapper campusMapper;

    @Override
    public AbstractService<Campus> getService() {
        return campusService;
    }

    @Override
    public AbstractMapper<Campus, CampusDto> getMapper() {
        return campusMapper;
    }
}
