package com.contact.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class User {

  private Integer userId;
  private String firstNm;
  private String lastNm;
  private String address;
  private String orgNm;
  Contact contact;
}
