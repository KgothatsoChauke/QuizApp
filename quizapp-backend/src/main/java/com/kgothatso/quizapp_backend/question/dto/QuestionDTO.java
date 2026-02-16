package com.kgothatso.quizapp_backend.question.dto;

import com.kgothatso.quizapp_backend.question.model.Difficulty;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.springframework.stereotype.Component;

@Component
public class QuestionDTO {
    private Long id;
    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String category;
    private Difficulty difficulty;
}
