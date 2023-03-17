package com.example.demo.infrastructure.adapter.car;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.car.CarGetService;
import com.example.demo.infrastructure.dto.CarroDto;
import com.example.demo.infrastructure.mapper.CarMapper;
import com.example.demo.infrastructure.repository.CarRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CarGetAdapter implements CarGetService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public Carro getCarro(String placa) {
        Optional<CarroDto> carroDto = carRepository.findById(placa);

        return carroDto.map(this::buildCarro).orElse(null);
    }

    public List<Carro> getListCarro(){
        List<CarroDto> carrosDto = carRepository.findAll();
        return carrosDto.stream().map(carMapper::toCarEntity).toList();
    }

    private Carro buildCarro(CarroDto carro){

        return new Carro(carro.getMarca(),carro.getPlaca(),carro.getColor(),carro.getPrecio(),
                carro.getModelo());
    }
}
