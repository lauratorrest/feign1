package com.example.demo.infrastructure.adapter.car;

import com.example.demo.domain.services.car.CarDeleteService;
import com.example.demo.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDeleteAdapter implements CarDeleteService {

  private final CarRepository carRepository;


  @Override
  public void deleteCar(String placa) {
    carRepository.deleteById(placa);
  }


}
