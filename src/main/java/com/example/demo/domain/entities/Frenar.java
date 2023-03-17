package com.example.demo.domain.entities;

public interface Frenar
{
    default public void frenar(){
        System.out.println("Frenando el Vehículo.");
    }

}
