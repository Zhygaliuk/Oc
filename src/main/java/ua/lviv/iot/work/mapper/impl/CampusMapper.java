package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.DTO.CampusDto;
import ua.lviv.iot.work.Domain.Campus;

@Component
public class CampusMapper implements AbstractMapper<Campus, CampusDto> {

    @Override
    public CampusDto map(Campus campus) {
        CampusDto.CampusDtoBuilder campusDtoBuilder = CampusDto.builder();
        campusDtoBuilder.name(campus.getName());
        campusDtoBuilder.id(campus.getId());
        campusDtoBuilder.adress(campus.getAdress());
        return campusDtoBuilder.build();
    }
}