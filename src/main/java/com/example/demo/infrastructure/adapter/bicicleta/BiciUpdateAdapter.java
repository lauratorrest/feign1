package com.example.demo.infrastructure.adapter.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.domain.services.bicicleta.BiciUpdateService;
import com.example.demo.infrastructure.repository.BiciRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciUpdateAdapter implements BiciUpdateService {
  private final BiciRepository biciRepository;

  @Transactional
  public void updateBici(Bicicleta bicicleta){
    biciRepository.updateBici(bicicleta.getMarca(),
                              bicicleta.getPlaca(),
                              bicicleta.getModelo(),
                              bicicleta.getPrecio(),
                              bicicleta.getTipoLlanta(),
                              bicicleta.getTamano(),
                              bicicleta.getCambios());
  }
}
