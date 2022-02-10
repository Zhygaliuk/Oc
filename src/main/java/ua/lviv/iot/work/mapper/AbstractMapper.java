package ua.lviv.iot.work.mapper;


public interface AbstractMapper<Entity, DTO> {
    DTO map(Entity entity);
}