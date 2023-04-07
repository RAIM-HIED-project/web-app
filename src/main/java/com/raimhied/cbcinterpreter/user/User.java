package com.raimhied.cbcinterpreter.user;

import jakarta.persistence.*;
import lombok.*;

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

    boolean smoker;
    boolean vegan;
    boolean supplements;
    String coronavirus;
    String pills;



    enum Frequency {
        MORE_THAN_ONCE_A_YEAR,
        ONCE_A_YEAR,
        LESS_THAN_ONCE_A_YEAR,
        HARD_TO_SAY
    }

    enum Reason {
        GENERIC_DOCTOR_VISIT,
        CHRONIC_ILLNESS_MONITORING,
        WORK_RELATED,
        OTHER,
        DONT_REMEMBER
    }

    enum Covid {
        NO_COVID,
        TWO_WEEKS_FROM_COVID,
        MORE_THAN_TWO_WEEKS,
        DONT_KNOW
    }

    Frequency frequency;

    Reason reason;

    Covid covid;

    boolean chronic_illness;

    List<String> illnesses;

    boolean allParametersOk;

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

    public void setAllParametersOk(boolean AllParametersOk) {
        allParametersOk = AllParametersOk;
    }

    public boolean isAllParametersOk() {
        return allParametersOk;
    }
}
