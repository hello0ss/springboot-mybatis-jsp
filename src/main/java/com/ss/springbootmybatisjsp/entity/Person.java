package com.ss.springbootmybatisjsp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String id;
    private String image;
    private String username;
    private String salary;
    private String age;
    private String seid;
    private Section section;

}
