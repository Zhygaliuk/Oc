package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.JournalDto;
import ua.lviv.iot.work.Domain.Journal;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class JournalMapper implements AbstractMapper<Journal, JournalDto> {

    @Override
    public JournalDto map(Journal journal) {
        JournalDto.JournalDtoBuilder journalDtoBuilder = JournalDto.builder();
        journalDtoBuilder.name(journal.getName());
        journalDtoBuilder.id(journal.getId());
        journalDtoBuilder.journal_head(journal.getJournal_head());
        return journalDtoBuilder.build();
    }
}