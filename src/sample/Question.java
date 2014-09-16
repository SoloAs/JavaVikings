package sample;

/**
 * Created by Alexander on 9/16/2014.
 */
public class Question {
    private String question;
    private String answer1;
    private String answer2;

    public Question()
    {
        question = answer1 = answer2 = "";
    }

    public void setquestion(String q)
    {
        question = q;
    }
    public void setanswer1(String a1)
    {
        answer1 = a1;
    }
    public void setanswer2(String a2)
    {
        answer2 = a2;
    }

    public String getquestion()
    {
        return question;
    }
    public String getanswer1()
    {
        return answer1;
    }

    public String aetanswer2()
    {
        return answer2;
    }

    public void SetAnswer(String q, String ans1, String ans2)
    {
            question = q;
            answer1 = ans1;
            answer2 = ans2;
    }

    public void GetAnswer()
    {
        System.out.print(question);
        System.out.print(answer1);
        System.out.print(answer2);
    }

}
