package com.quiz_webapp.quiz_app.controller;

import com.quiz_webapp.quiz_app.entity.Question;
import com.quiz_webapp.quiz_app.repository.QuestionRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    private final QuestionRepository repo;

    public QuizController(QuestionRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/submit")
    public int submitQuiz(@RequestBody Map<Long, String> userAnswers) {
        int score = 0;
        for (Map.Entry<Long, String> entry : userAnswers.entrySet()) {
            Question q = repo.findById(entry.getKey()).orElse(null);
            if (q != null && q.getCorrectOption().equalsIgnoreCase(entry.getValue())) {
                score++;
            }
        }
        return score;
    }
}
