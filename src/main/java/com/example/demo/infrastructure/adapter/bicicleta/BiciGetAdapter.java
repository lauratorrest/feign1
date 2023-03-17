package com.example.demo.infrastructure.adapter.bicicleta;

import com.example.demo.domain.entities.Bicicleta;
import com.example.demo.domain.services.bicicleta.BiciGetService;
import com.example.demo.infrastructure.dto.BicicletaDto;
import com.example.demo.infrastructure.mapper.BiciMapper;
import com.example.demo.infrastructure.repository.BiciRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BiciGetAdapter implements BiciGetService {
  private final BiciRepository biciRepository;
  private final BiciMapper biciMapper;

  public Bicicleta getBici(String placa) {
    Optional<BicicletaDto> biciDto = biciRepository.findById(placa);

    return biciDto.map(this::buildBici).orElse(null);
  }

  public List<Bicicleta> getListBici(){
    List<BicicletaDto> bicisDto = biciRepository.findAll();
    return bicisDto.stream().map(biciMapper::toBicicletaEntity).toList();
  }

  private Bicicleta buildBici(BicicletaDto bicicleta){

    return new Bicicleta(bicicleta.getMarca(), bicicleta.getPlaca(), bicicleta.getModelo(), bicicleta.getPrecio(), bicicleta.getTipoLlanta(), bicicleta.getTamano(), bicicleta.getCambios());
  }
}
