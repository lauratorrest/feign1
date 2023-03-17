package com.example.demo.application.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.domain.entities.Persona;
import com.example.demo.domain.services.bicicleta.BiciSaveService;
import com.example.demo.domain.services.persona.PersonaGetService;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class BiciSave {

  private final BiciSaveService biciSaveService;
  private final PersonaGetService personaGetService;

  public Bicicleta saveBici(Bicicleta bicicleta, String id) {
    Persona persona = personaGetService.getPersona(id);
    if(Objects.nonNull(persona)){
      return biciSaveService.save(bicicleta);

    }
    throw new RuntimeException();
  }
}
