package com.example.demo.infrastructure.adapter.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.domain.services.bicicleta.BiciSaveService;
import com.example.demo.infrastructure.dto.BicicletaDto;
import com.example.demo.infrastructure.mapper.BiciMapper;
import com.example.demo.infrastructure.repository.BiciRepository;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciSaveAdapter implements BiciSaveService {
  private final BiciRepository biciRepository;
  private final BiciMapper biciMapper;

  public Bicicleta save(Bicicleta bicicleta){
    return biciMapper.toBicicletaEntity(biciRepository.save(biciMapper.toDto(bicicleta)));
  }



  private BicicletaDto buildBiciDto(Bicicleta bicicleta){
    return new BicicletaDto(bicicleta.getMarca(), bicicleta.getPlaca(), bicicleta.getModelo(), bicicleta.getPrecio(), bicicleta.getTipoLlanta(), bicicleta.getTamano(), bicicleta.getCambios());
  }
}
