package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.BicicletaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BiciRepository extends JpaRepository<BicicletaDto,String> {
  @Query(nativeQuery = true , value = "update inventario.public.bicicleta_dto set marca = :marca, modelo = :modelo, precio = :precio, tipo_llanta = :tipo_llanta, tamano = :tamano, cambios = :cambios where placa = :placa")
  @Modifying
  void updateBici(@Param("marca") String marca,
      @Param("placa") String placa,
      @Param("modelo") String modelo,
      @Param("precio") Double precio,
      @Param("tipo_llanta") String tipoLlanta,
      @Param("tamano") int tamano,
      @Param("cambios") int cambios);
}
