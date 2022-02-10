package ua.lviv.iot.work.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.work.Domain.SignalSystem;
import ua.lviv.iot.work.repo.SignalSystemRepository;
import ua.lviv.iot.work.service.AbstractService;

@AllArgsConstructor
@Service
public class SignalSystemService extends AbstractService<SignalSystem> {
    private final SignalSystemRepository signalSystemRepository;

    @Override
    public JpaRepository<SignalSystem, Integer> getRepository() {
        return  signalSystemRepository;
    }
}
