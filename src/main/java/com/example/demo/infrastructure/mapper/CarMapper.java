package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Carro;
import com.example.demo.infrastructure.dto.CarroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper{

    Carro toCarEntity(CarroDto carroDto);

    @Mapping(target="marca", source="marca")
    @Mapping(target="placa", source="placa")
    @Mapping(target="modelo", source="modelo")
    @Mapping(target="precio", source="precio")
    @Mapping(target="color", source="color")
    CarroDto toDto(Carro carro);
}
