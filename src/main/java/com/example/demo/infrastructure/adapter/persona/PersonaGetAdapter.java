package com.example.demo.infrastructure.adapter.persona;

import com.example.demo.domain.entities.Persona;
import com.example.demo.domain.services.persona.PersonaGetService;
import com.example.demo.infrastructure.client.PersonaClient;
import com.example.demo.infrastructure.mapper.PersonaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaGetAdapter implements PersonaGetService {
  private final PersonaMapper personaMapper;
  private final PersonaClient personaClient;

  @Override
  public Persona getPersona(String id) {
    return personaMapper.toPersonaEntity(personaClient.getPersona(id));
  }
}
