package com.quiz_webapp.quiz_app.controller;

import com.quiz_webapp.quiz_app.entity.Question;
import com.quiz_webapp.quiz_app.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService=questionService;
    }
    @GetMapping
    public List<Question> getAll(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/category/{category}")
    public List<Question> getByCategory(@PathVariable String category){
        return  questionService.getQuestionByCategory(category);
    }

    @PostMapping
    public Question add(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
