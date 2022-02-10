package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.Journal;
import ua.lviv.iot.work.repo.CompanyRepository;
import ua.lviv.iot.work.repo.JournalRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class JournalService extends AbstractService<Journal> {
    private final JournalRepository journalRepository;

    @Override
    public JpaRepository<Journal, Integer> getRepository() {
        return  journalRepository;
    }
}
