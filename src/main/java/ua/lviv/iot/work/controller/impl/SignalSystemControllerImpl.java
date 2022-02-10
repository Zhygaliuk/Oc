package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.SignalSystemDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.SignalSystem;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.SignalSystemMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.SignalSystemService;

@CrossOrigin
@RequestMapping(value = "/signal_system")
@RestController
@AllArgsConstructor
public class SignalSystemControllerImpl extends AbstractControllerImpl<SignalSystem, SignalSystemDto> {
    private final SignalSystemService signalSystemService;
    private final SignalSystemMapper signalSystemMapper;

    @Override
    public AbstractService<SignalSystem> getService() {
        return signalSystemService;
    }

    @Override
    public AbstractMapper<SignalSystem, SignalSystemDto> getMapper() {
        return signalSystemMapper;
    }
}