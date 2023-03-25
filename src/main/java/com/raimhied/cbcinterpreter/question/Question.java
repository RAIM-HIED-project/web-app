package com.raimhied.cbcinterpreter.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Question {

    int id;
    HashMap<String, String> content = new HashMap<>();

}
