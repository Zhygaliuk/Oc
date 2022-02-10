package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.ControlZone;
import ua.lviv.iot.work.repo.ControlZoneRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class ControlZoneService extends AbstractService<ControlZone> {
    private final ControlZoneRepository controlZoneRepository;

    @Override
    public JpaRepository<ControlZone, Integer> getRepository() {
        return controlZoneRepository;
    }
}
