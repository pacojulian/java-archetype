package com.example.archetype.adapter.out.entity;

import lombok.Builder;
import lombok.Data;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Table;

//@Table("User")
@Data
@Builder
public class R2BCUser {
//    @Id
    private String id;
    private String name;
    private String email;
    private String password;
}
