package com.quiz_webapp.quiz_app.repository;

import com.quiz_webapp.quiz_app.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//import org.springframework.stereotype.Repository;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    List<Question> findByCategory(String category);
}
