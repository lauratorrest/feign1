package com.example.demo.domain.services.car;

import com.example.demo.domain.entities.Carro;
import java.util.List;

public interface CarGetService {
    Carro getCarro (String placa);
    List<Carro> getListCarro();
}
