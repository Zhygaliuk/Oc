package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.DTO.CompanyDto;
import ua.lviv.iot.work.Domain.Company;

@Component
public class CompanyMapper implements AbstractMapper<Company, CompanyDto> {

    @Override
    public CompanyDto map(Company company){
        CompanyDto.CompanyDtoBuilder campusDtoBuilder = CompanyDto.builder();
        campusDtoBuilder.name(company.getName());
        campusDtoBuilder.id(company.getId());
        campusDtoBuilder.phone_number(company.getPhone_number());
        campusDtoBuilder.CEO(company.getCEO());
        campusDtoBuilder.number_of_employees(company.getNumber_of_employees());
        campusDtoBuilder.since_date(company.getSince_date());
        return campusDtoBuilder.build();
    }
}
