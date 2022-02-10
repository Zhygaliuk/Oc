package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.JournalEntry;
import ua.lviv.iot.work.repo.JournalEntryRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class JournalEntryService extends AbstractService<JournalEntry> {
    private final JournalEntryRepository journalEntryRepository;

    @Override
    public JpaRepository<JournalEntry, Integer> getRepository() {
        return  journalEntryRepository;
    }
}
