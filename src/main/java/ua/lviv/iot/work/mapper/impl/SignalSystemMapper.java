package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.SignalSystemDto;
import ua.lviv.iot.work.Domain.SignalSystem;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class SignalSystemMapper implements AbstractMapper<SignalSystem, SignalSystemDto> {

    @Override
    public SignalSystemDto map(SignalSystem signalSystem) {
        SignalSystemDto.SignalSystemDtoBuilder signalSystemDtoBuilder = SignalSystemDto.builder();
        signalSystemDtoBuilder.id(signalSystem.getId());
        signalSystemDtoBuilder.system_type(signalSystem.getSystem_type());
        return signalSystemDtoBuilder.build();
    }
}
