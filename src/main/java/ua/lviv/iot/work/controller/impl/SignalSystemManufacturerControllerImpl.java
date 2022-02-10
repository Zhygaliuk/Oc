package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.SignalSystemManufacturerDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.SignalSystemManufacturer;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.SignalSystemManufacturerMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.SignalSystemManufacturerService;

@CrossOrigin
@RequestMapping(value = "/signal_system_manufacturer")
@RestController
@AllArgsConstructor
public class SignalSystemManufacturerControllerImpl extends AbstractControllerImpl<SignalSystemManufacturer, SignalSystemManufacturerDto> {
    private final SignalSystemManufacturerMapper signalSystemManufacturerMapper;
    private final SignalSystemManufacturerService signalSystemManufacturerService;

    @Override
    public AbstractService<SignalSystemManufacturer> getService() {
        return signalSystemManufacturerService;
    }

    @Override
    public AbstractMapper<SignalSystemManufacturer, SignalSystemManufacturerDto> getMapper() {
        return signalSystemManufacturerMapper;
    }
}