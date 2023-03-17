package com.example.demo.application.car;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.car.CarSaveServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CarSave {

  private final CarSaveServices carSaveService;

  public Carro saveCar(Carro carro){
    return carSaveService.save(carro);
  }

}
