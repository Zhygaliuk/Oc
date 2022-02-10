package ua.lviv.iot.work.mapper.impl;

import org.springframework.stereotype.Component;
import ua.lviv.iot.work.DTO.JournalEntryDto;
import ua.lviv.iot.work.Domain.JournalEntry;
import ua.lviv.iot.work.mapper.AbstractMapper;

@Component
public class JournalEntryMapper implements AbstractMapper<JournalEntry, JournalEntryDto> {

    @Override
    public JournalEntryDto map(JournalEntry journalEntry) {
        JournalEntryDto.JournalEntryDtoBuilder journalEntryDtoBuilder = JournalEntryDto.builder();
        journalEntryDtoBuilder.author_name(journalEntry.getAuthor_name());
        journalEntryDtoBuilder.id(journalEntry.getId());
        journalEntryDtoBuilder.description(journalEntry.getDescription());
        journalEntryDtoBuilder.state(journalEntry.getState());
        journalEntryDtoBuilder.date_of_entry(journalEntry.getDate_of_entry());
        journalEntryDtoBuilder.countermeasure(journalEntry.getCountermeasure());
        return journalEntryDtoBuilder.build();
    }
}
