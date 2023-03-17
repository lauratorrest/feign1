package com.example.demo.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class BicicletaDto extends VehiculoDto{
  private String tipoLlanta;
  private int tamano;
  private int cambios;

  public BicicletaDto(String marca, String placa, String modelo, double precio, String tipoLlanta, int tamano, int cambios) {
    super(marca,placa,modelo,precio);
    this.tipoLlanta = tipoLlanta;
    this.tamano = tamano;
    this.cambios = cambios;
  }
}
