package ua.lviv.iot.work.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.service.AbstractService;

import java.util.List;

@CrossOrigin
public interface AbstractController<Entity, DTO> {
    AbstractService<Entity> getService();
    AbstractMapper<Entity, DTO> getMapper();

    ResponseEntity<List<DTO>> getAll();
    ResponseEntity<DTO> get(Integer id);
    ResponseEntity<DTO> update(Integer id, Entity entity);
    ResponseEntity<DTO> delete(Integer id);
    ResponseEntity<DTO> create(Entity entity);
}
