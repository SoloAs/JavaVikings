package sample;

import java.util.Scanner;

/**
 * Created by Alexander on 9/16/2014.
 */
public class Vikings {
    private Question[] questions = new Question[2];

    public int getQuestionNumber()
    {
        return questions.length;
    }

    public void SetQs(Question[] questions)
    {
        this.questions = questions;
    }

    public void GetQs()
    {
        for(int i = 0; i < questions.length; i++)
            questions[i].GetAnswer();
    }
}
