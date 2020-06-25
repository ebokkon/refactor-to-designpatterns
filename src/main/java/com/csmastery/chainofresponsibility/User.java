package com.csmastery.chainofresponsibility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

  private String name;
  private int age;
  private String email;

}
