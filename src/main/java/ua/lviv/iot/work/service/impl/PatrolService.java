package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.Campus;
import ua.lviv.iot.work.Domain.Company;
import ua.lviv.iot.work.Domain.Patrol;
import ua.lviv.iot.work.repo.CampusRepository;
import ua.lviv.iot.work.repo.CompanyRepository;
import ua.lviv.iot.work.repo.PatrolRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class PatrolService extends AbstractService<Patrol> {
    private final PatrolRepository patrolRepository;

    @Override
    public JpaRepository<Patrol, Integer> getRepository() {
        return  patrolRepository;
    }
}
