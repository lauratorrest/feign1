package com.example.demo.domain.services.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import java.util.List;

public interface BiciGetService {
  Bicicleta getBici(String placa);

  List<Bicicleta> getListBici();
}
