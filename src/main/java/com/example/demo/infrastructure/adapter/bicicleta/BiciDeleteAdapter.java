package com.example.demo.infrastructure.adapter.bicicleta;

import com.example.demo.domain.services.bicicleta.BiciDeleteService;
import com.example.demo.infrastructure.repository.BiciRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciDeleteAdapter implements BiciDeleteService {
  private final BiciRepository biciRepository;
  @Override
  public void deleteBici(String placa) {
    biciRepository.deleteById(placa);
  }
}
