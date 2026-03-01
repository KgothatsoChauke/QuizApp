package com.kgothatso.quizapp_backend.question.mapper;


import com.kgothatso.quizapp_backend.question.dto.CreateQuestionRequest;
import com.kgothatso.quizapp_backend.question.dto.QuestionDTO;
import com.kgothatso.quizapp_backend.question.model.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    QuestionDTO toDto(Question question);
    Question toEntity(CreateQuestionRequest createQuestionRequest);
    List<QuestionDTO> toDtoList(List<Question> questions);
}
