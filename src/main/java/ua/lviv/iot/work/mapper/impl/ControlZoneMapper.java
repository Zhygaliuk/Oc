package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.ControlZoneDto;
import ua.lviv.iot.work.Domain.ControlZone;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class ControlZoneMapper implements AbstractMapper<ControlZone, ControlZoneDto> {

    @Override
    public ControlZoneDto map(ControlZone controlZone){
        ControlZoneDto.ControlZoneDtoBuilder controlZoneDtoBuilder = ControlZoneDto.builder();
        controlZoneDtoBuilder.name(controlZone.getName());
        controlZoneDtoBuilder.id(controlZone.getId());
        controlZoneDtoBuilder.area(controlZone.getArea());
        controlZoneDtoBuilder.zone_type(controlZone.getZone_type());
        controlZoneDtoBuilder.campus_id(controlZone.getCampus().getId());
        return controlZoneDtoBuilder.build();
    }
}
