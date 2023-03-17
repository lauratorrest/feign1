package com.example.demo.application.bicicleta;

import com.example.demo.domain.services.bicicleta.BiciDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciDelete {
  private final BiciDeleteService biciDeleteService;

  public void deleteBici(String placa){biciDeleteService.deleteBici(placa);}
}
