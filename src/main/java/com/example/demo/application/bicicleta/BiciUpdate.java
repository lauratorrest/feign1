package com.example.demo.application.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.domain.services.bicicleta.BiciUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciUpdate {
  private final BiciUpdateService biciUpdateService;

  public  void updateBici(Bicicleta bicicleta){
    biciUpdateService.updateBici(bicicleta);
  }
}
