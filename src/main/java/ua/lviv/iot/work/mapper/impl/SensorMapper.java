package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.SensorDto;
import ua.lviv.iot.work.Domain.Sensor;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class SensorMapper implements AbstractMapper<Sensor, SensorDto> {

    @Override
    public SensorDto map(Sensor sensor) {
        SensorDto.SensorDtoBuilder sensorDtoBuilder = SensorDto.builder();
        sensorDtoBuilder.id(sensor.getId());
        sensorDtoBuilder.sensor_type(sensor.getSensor_type());
        sensorDtoBuilder.wireless(sensor.getWireless());
        sensorDtoBuilder.power_supply(sensor.getPower_supply());
        return sensorDtoBuilder.build();
    }
}