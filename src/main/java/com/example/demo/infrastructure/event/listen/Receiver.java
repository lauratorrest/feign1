package com.example.demo.infrastructure.event.listen;

import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Receiver {


  public static String RECEIVE_METHOD_NAME = "receiveMessage";

  public void receivenMessage(byte[] message){
    log.info("Receive message [ {} ] ", new String(message, StandardCharsets.UTF_8));
  }
}
