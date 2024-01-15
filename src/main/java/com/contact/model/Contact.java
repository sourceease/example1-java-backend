package com.contact.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Contact {
    private Integer contactId;
    private Long phoneNum;
    private String email;
   
}