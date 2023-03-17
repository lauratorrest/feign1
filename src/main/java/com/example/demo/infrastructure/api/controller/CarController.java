package com.example.demo.infrastructure.api.controller;


import com.example.demo.application.car.CarDelete;
import com.example.demo.application.car.CarGet;
import com.example.demo.application.car.CarSave;
import com.example.demo.application.car.CarUpdate;
import com.example.demo.domain.entities.Carro;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/car")
public class CarController {
    private final CarSave carSave;
    private final CarGet carGet;
    private final CarDelete carDelete;
    private final CarUpdate carUpdate;

    //Buscar por placa (poner la placa en los params de postman)
    @GetMapping()
    public ResponseEntity<Carro> getCar(@RequestParam String placa){

        return ResponseEntity.ok(carGet.getCar(placa));
    }

    //Buscar todos los carros
    @GetMapping(value = "/todos")
    public ResponseEntity<List<Carro>> getAllCars(){
      return ResponseEntity.ok(carGet.getListCarro());
    }

    //Guardar
      @PostMapping
      public ResponseEntity<Carro> createCarro(@RequestBody Carro car){
        return new ResponseEntity<>(carSave.saveCar(car), HttpStatus.CREATED);
      }

      //Borrar
      @DeleteMapping("/placa/{placa}")
      public void deleteCar(@PathVariable String placa){
        carDelete.deleteCarro(placa);
      }

      //Actualizar
      @PutMapping()
      public void updateCar(@RequestBody Carro carro){
        carUpdate.updateCar(carro);
      }

      //@PutMapping





}
