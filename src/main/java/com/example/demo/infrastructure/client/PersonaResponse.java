package com.example.demo.infrastructure.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PersonaResponse {
  private String nombre;
  private String apellido;
  private String id;
  private String tipoId;

  public PersonaResponse(String nombre, String apellido, String id, String tipoId) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.id = id;
    this.tipoId = tipoId;
  }
}
