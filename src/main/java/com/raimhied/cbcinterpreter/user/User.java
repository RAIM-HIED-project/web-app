package com.raimhied.cbcinterpreter.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    int age;
    char sex;
    String bloodGroup;
    boolean smoker;
    boolean coronavirus;
    String examinationsNum;
    String chronicDiseases;

    float RCC;
    float Hb;
    float Hct;
    float MCV;
    float MCH;
    float MCHC;
    float RDW;
    float WBC;
    float platelets;
    float neutrophil;
    float lymphocyte;
    float monocyte;
    float eosinophil;
    float basophil;


    public User(int age, char sex) {
        this.age = age;
        this.sex = sex;
    }





}
