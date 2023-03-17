package com.example.demo.application.car;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.car.CarGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CarGet {

    private final CarGetService carGetService;

    public Carro getCar(String placa){
        return carGetService.getCarro(placa);
    }

    public List<Carro> getListCarro(){
        return carGetService.getListCarro();
    }
}
