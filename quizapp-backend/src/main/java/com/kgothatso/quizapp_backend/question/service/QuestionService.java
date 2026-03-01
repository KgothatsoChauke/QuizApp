package com.kgothatso.quizapp_backend.question.service;

import com.kgothatso.quizapp_backend.question.dto.CreateQuestionRequest;
import com.kgothatso.quizapp_backend.question.dto.QuestionDTO;
import com.kgothatso.quizapp_backend.question.exception.QuestionNotFoundException;
import com.kgothatso.quizapp_backend.question.mapper.QuestionMapper;
import com.kgothatso.quizapp_backend.question.model.Question;
import com.kgothatso.quizapp_backend.question.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public QuestionService(QuestionRepository questionRepository, QuestionMapper questionMapper){
        this.questionRepository = questionRepository;
        this.questionMapper = questionMapper;
    }


    //build a question
    public QuestionDTO createQuestion(CreateQuestionRequest request){
        Question question = questionMapper.toEntity(request);
        Question saved = questionRepository.save(question);

        return questionMapper.toDto(saved);
    }

    //return all questions
    public List<QuestionDTO> getAllQuestions(){
        return questionMapper.toDtoList(questionRepository.findAll());
    }

    //find question by id
    public QuestionDTO getQuestionById(Long id){
        Question question = questionRepository.findById(id)
                .orElseThrow(()-> new QuestionNotFoundException(id));
        return questionMapper.toDto(question);
    }


}
