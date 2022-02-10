package ua.lviv.iot.work.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.work.Domain.Campus;

@Repository
public interface CampusRepository extends JpaRepository<Campus, Integer> {

}