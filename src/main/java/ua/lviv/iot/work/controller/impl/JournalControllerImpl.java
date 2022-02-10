package ua.lviv.iot.work.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.work.DTO.JournalDto;
import ua.lviv.iot.work.controller.AbstractControllerImpl;
import ua.lviv.iot.work.Domain.Journal;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.mapper.impl.JournalMapper;
import ua.lviv.iot.work.service.AbstractService;
import ua.lviv.iot.work.service.impl.JournalService;

@CrossOrigin
@RequestMapping(value = "/journal")
@RestController
@AllArgsConstructor
public class JournalControllerImpl extends AbstractControllerImpl<Journal, JournalDto> {
    private final JournalService journalService;
    private final JournalMapper journalMapper;

    @Override
    public AbstractService<Journal> getService() {
        return journalService;
    }

    @Override
    public AbstractMapper<Journal, JournalDto> getMapper() {
        return journalMapper;
    }
}

