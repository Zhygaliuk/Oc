package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.SignalSystemManufacturerDto;
import ua.lviv.iot.work.Domain.SignalSystemManufacturer;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class SignalSystemManufacturerMapper implements AbstractMapper<SignalSystemManufacturer, SignalSystemManufacturerDto> {

    @Override
    public SignalSystemManufacturerDto map(SignalSystemManufacturer signalSystemManufacturer) {
        SignalSystemManufacturerDto.SignalSystemManufacturerDtoBuilder signalSystemManufacturerDtoBuilder =
                SignalSystemManufacturerDto.builder();
        signalSystemManufacturerDtoBuilder.id(signalSystemManufacturer.getId());
        signalSystemManufacturerDtoBuilder.name(signalSystemManufacturer.getName());
        signalSystemManufacturerDtoBuilder.phone(signalSystemManufacturer.getPhone());
        signalSystemManufacturerDtoBuilder.advertisment(signalSystemManufacturer.getAdvertisment());
        return signalSystemManufacturerDtoBuilder.build();
    }
}
