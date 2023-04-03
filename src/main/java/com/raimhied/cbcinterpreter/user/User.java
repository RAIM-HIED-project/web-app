package com.raimhied.cbcinterpreter.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long userId;

    int age;
    int weight;
    int height;
    String sex;

    boolean pregnancy;

    String bloodGroup;
    boolean smoker;
    String coronavirus;
    String examinationsNum;
    String chronicDiseases;
    String pills;

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

    // This constructor added for testing (maybe delete later)
    public User(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }





}
