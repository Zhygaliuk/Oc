package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.work.Domain.SignalSystemManufacturer;
import ua.lviv.iot.work.repo.SignalSystemManufacturerRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class SignalSystemManufacturerService extends AbstractService<SignalSystemManufacturer> {
    private final SignalSystemManufacturerRepository signalSystemManufacturerRepository;

    @Override
    public JpaRepository<SignalSystemManufacturer, Integer> getRepository() {
        return  signalSystemManufacturerRepository;
    }
}
