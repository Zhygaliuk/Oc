package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.JournalEntryDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.JournalEntry;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.JournalEntryMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.JournalEntryService;

@CrossOrigin
@RequestMapping(value = "/journal_entry")
@RestController
@AllArgsConstructor
public class JournalEntryControllerImpl extends AbstractControllerImpl<JournalEntry, JournalEntryDto> {
    private final JournalEntryService journalEntryService;
    private final JournalEntryMapper journalEntryMapper;

    @Override
    public AbstractService<JournalEntry> getService() {
        return journalEntryService;
    }

    @Override
    public AbstractMapper<JournalEntry, JournalEntryDto> getMapper() {
        return journalEntryMapper;
    }
}
