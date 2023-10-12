package com.ashraf.quizapp.service;

import com.ashraf.quizapp.dao.QuestionDao;
import com.ashraf.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public String addNewQuestion(Question question) {
        return questionDao.save(question).toString();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.getByCategory(category);
    }
}
