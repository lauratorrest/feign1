package com.example.demo.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bicicleta extends Vehiculo{
  private String tipoLlanta;
  private int tamano;
  private int cambios;

  public Bicicleta(String marca, String placa, String modelo, double precio, String tipoLlanta, int tamano, int cambios) {
    this.tipoLlanta = tipoLlanta;
    this.tamano = tamano;
    this.cambios = cambios;
  }
}
