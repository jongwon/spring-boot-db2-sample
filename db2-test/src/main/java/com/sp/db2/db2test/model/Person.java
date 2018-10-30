package com.sp.db2.db2test.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="tbl_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;

    private String name;

    private String email;

    private String phone;



}
