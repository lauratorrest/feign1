package com.example.demo.domain.entities;

public interface iniciarMarcha {
    default public void iniciarMarcha(){
        System.out.println("Iniciando marcha");
    }
}
