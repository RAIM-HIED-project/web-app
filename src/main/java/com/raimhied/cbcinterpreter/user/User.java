package com.raimhied.cbcinterpreter.user;

import jakarta.persistence.*;
import lombok.*;

import javax.swing.*;
import java.util.List;

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

    boolean isVegan;
    boolean smoker;
    String coronavirus;
    String examinationsNum;
    String chronicDiseases;
    String pills;

    enum Frequency {
        MORE_THAN_ONCE_A_YEAR,
        ONCE_A_YEAR,
        LESS_THAN_ONCE_A_YEAR,
        HARD_TO_SAY
    }

    Frequency frequency;

    boolean chronic_illness;

    List<String> illnesses;

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
