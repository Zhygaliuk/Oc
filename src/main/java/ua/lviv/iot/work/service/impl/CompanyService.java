package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.Campus;
import ua.lviv.iot.work.Domain.Company;
import ua.lviv.iot.work.repo.CampusRepository;
import ua.lviv.iot.work.repo.CompanyRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class CompanyService extends AbstractService<Company> {
    private final CompanyRepository companyRepository;

    @Override
    public JpaRepository<Company, Integer> getRepository() {
        return  companyRepository;
    }
}
