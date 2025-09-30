package com.quiz_webapp.quiz_app.service;

import com.quiz_webapp.quiz_app.entity.Question;
import com.quiz_webapp.quiz_app.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository=questionRepository;
    }

    public List<Question> getAllQuestion(){
        return questionRepository.findAll();
    }

    public List<Question> getQuestionByCategory(String category){
        return questionRepository.findByCategory(category);
    }

    public Question addQuestion(Question question){
        return questionRepository.save(question);
    }
}
