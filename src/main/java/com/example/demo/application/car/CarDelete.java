package com.example.demo.application.car;

import com.example.demo.domain.services.car.CarDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

  private final CarDeleteService carDeleteService;

  public void deleteCarro(String placa){
    carDeleteService.deleteCar(placa);
  }

}
