package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.infrastructure.dto.BicicletaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BiciMapper {
  Bicicleta toBicicletaEntity(BicicletaDto bicicletaDto);
  BicicletaDto toDto(Bicicleta bicicleta);
}
