package ua.lviv.iot.work.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.work.Domain.Campus;
import ua.lviv.iot.work.Domain.SignalSystemManufacturer;

@Repository
public interface SignalSystemManufacturerRepository extends JpaRepository<SignalSystemManufacturer, Integer> {

}