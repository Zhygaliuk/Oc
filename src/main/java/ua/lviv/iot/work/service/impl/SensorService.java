package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.Campus;
import ua.lviv.iot.work.Domain.Company;
import ua.lviv.iot.work.Domain.Sensor;
import ua.lviv.iot.work.repo.CampusRepository;
import ua.lviv.iot.work.repo.CompanyRepository;
import ua.lviv.iot.work.repo.SensorRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class SensorService extends AbstractService<Sensor> {
    private final SensorRepository sensorRepository;

    @Override
    public JpaRepository<Sensor, Integer> getRepository() {
        return  sensorRepository;
    }
}
