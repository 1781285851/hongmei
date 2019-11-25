package com.info.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String code;
    private String name;
    private Integer gender;
    private String password;
    private String phone;
    private String desceiption;
    private Integer roleId;
}
