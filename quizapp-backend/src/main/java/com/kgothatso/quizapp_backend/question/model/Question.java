package com.kgothatso.quizapp_backend.question.model;


import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private String correctOption;
    private String category;
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

}
