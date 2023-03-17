package com.example.demo.application.car;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.car.CarUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarUpdate {
  private final CarUpdateService carUpdateService;

  public void updateCar(Carro carro){
    carUpdateService.updateCar(carro);
  }
}
