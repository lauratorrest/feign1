package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Persona;
import com.example.demo.infrastructure.client.PersonaResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
  Persona toPersonaEntity(PersonaResponse personaResponse);

  PersonaResponse toPersonaResponse(Persona persona);
}
