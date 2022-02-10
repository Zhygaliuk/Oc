package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.CompanyDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.Company;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.CompanyMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.CompanyService;

@CrossOrigin
@RequestMapping(value = "/company")
@RestController
@AllArgsConstructor
public class CompanyControllerImpl extends AbstractControllerImpl<Company, CompanyDto> {
    private final CompanyService companyService;
    private final CompanyMapper companyMapper;

    @Override
    public AbstractService<Company> getService() {
        return companyService;
    }

    @Override
    public AbstractMapper<Company, CompanyDto> getMapper() {
        return companyMapper;
    }
}