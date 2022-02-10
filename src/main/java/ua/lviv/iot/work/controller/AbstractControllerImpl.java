package ua.lviv.iot.work.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.work.mapper.AbstractMapper;
import ua.lviv.iot.work.service.AbstractService;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
public abstract class AbstractControllerImpl<Entity, DTO> implements AbstractController<Entity, DTO>{
    AbstractService<Entity> service = getService();
    AbstractMapper<Entity, DTO> mapper = getMapper();

    @GetMapping
    @Override
    public ResponseEntity<List<DTO>> getAll() {
        List<DTO> dtoList = getService().getAll().stream()
                .map(entity -> getMapper().map(entity)).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(getMapper().map(getService().get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> delete(@PathVariable Integer id) {

        return new ResponseEntity<>(getMapper().map(getService().delete(id)), HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity<DTO> create(  Entity entity) {
        System.out.println(entity);
        return new ResponseEntity<>(getMapper().map(getService().create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> update(@PathVariable Integer id, Entity entity) {
        return new ResponseEntity<>(getMapper().map(getService().update(id, entity)), HttpStatus.OK);
    }
}

