package com.example.demo.infrastructure.adapter.car;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.car.CarSaveServices;
import com.example.demo.infrastructure.dto.CarroDto;
import com.example.demo.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CarSaveAdapter implements CarSaveServices {

  private final CarRepository carRepository;


  @Override
  public Carro save(Carro carro){

    return buildCarro(carRepository.save(buildCarroDto(carro)));
  }

  private Carro buildCarro(CarroDto carro){
    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }


  private CarroDto buildCarroDto(Carro carro){
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }
}
