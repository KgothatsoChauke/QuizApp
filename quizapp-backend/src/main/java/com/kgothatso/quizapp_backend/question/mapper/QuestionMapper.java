package com.kgothatso.quizapp_backend.question.mapper;


import com.kgothatso.quizapp_backend.question.dto.CreateQuestionRequest;
import com.kgothatso.quizapp_backend.question.dto.QuestionDTO;
import com.kgothatso.quizapp_backend.question.model.Question;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    QuestionDTO toDTO(Question question);
    Question toEntity(CreateQuestionRequest createQuestionRequest);



}
