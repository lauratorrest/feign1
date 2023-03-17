package com.example.demo.infrastructure.adapter.car;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.car.CarUpdateService;
import com.example.demo.infrastructure.repository.CarRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarUpdateAdapter implements CarUpdateService {
  private final CarRepository carRepository;

  @Transactional
  public void updateCar(Carro carro){
    carRepository.updateCar(carro.getMarca(),
                            carro.getPlaca(),
                            carro.getModelo(),
                            carro.getPrecio(),
                            carro.getColor());
  }
}
