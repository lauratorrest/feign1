package com.example.demo.domain.entities;

public interface Acelerar {
    default public void acelerarVehiculo(){
        System.out.println("Acelenrando el vehículo.");
    }
}
