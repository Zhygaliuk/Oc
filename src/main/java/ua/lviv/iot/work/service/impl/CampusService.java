package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.Campus;
import ua.lviv.iot.work.repo.CampusRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class CampusService extends AbstractService<Campus> {
    private final CampusRepository campusRepository;

    @Override
    public JpaRepository<Campus, Integer> getRepository() {
            return campusRepository;
    }
}
