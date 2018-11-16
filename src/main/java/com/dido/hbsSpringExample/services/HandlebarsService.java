package com.dido.hbsSpringExample.services;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class HandlebarsService {

  public Integer getResult() {
    Random random = new Random();
    Integer min = 1;
    Integer max = 100;

    Integer result = random.nextInt(max - min) + min;

    return result;
  }
}
