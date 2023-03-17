package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.bicicleta.*;
import com.example.demo.domain.entities.Bicicleta;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/bici")
public class BicicletaController {
  private final BiciSave biciSave;
  private final BiciGet biciGet;
  private final BiciUpdate biciUpdate;
  private final BiciDelete biciDelete;

  //Crear
  @PostMapping
  public ResponseEntity<Bicicleta> createBici(@RequestBody Bicicleta bicicleta, @RequestHeader("id") String id){
    return new ResponseEntity<>(biciSave.saveBici(bicicleta,id), HttpStatus.CREATED);
  }

  //Buscar por placa (poner la placa en los params de postman)
  @GetMapping()
  public ResponseEntity<Bicicleta> getBici(@RequestParam String placa){

    return ResponseEntity.ok(biciGet.getBici(placa));
  }

  //Buscar todas las bicis
  @GetMapping(value = "/todos")
  public ResponseEntity<List<Bicicleta>> getAllBicis(){
    return ResponseEntity.ok(biciGet.getListBici());
  }

  //Actualizar
  @PutMapping()
  public void updateBici(@RequestBody Bicicleta bicicleta){
    biciUpdate.updateBici(bicicleta);
  }

  //Borrar
  @DeleteMapping("/placa/{placa}")
  public void deleteBici(@PathVariable String placa){biciDelete.deleteBici(placa);}
}
