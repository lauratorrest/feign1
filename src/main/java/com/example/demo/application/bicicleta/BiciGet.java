package com.example.demo.application.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.domain.services.bicicleta.BiciGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciGet{
  private final BiciGetService biciGetService;

  public Bicicleta getBici(String placa){
    return biciGetService.getBici(placa);
  }

  public List<Bicicleta> getListBici(){
    return biciGetService.getListBici();
  }
}
