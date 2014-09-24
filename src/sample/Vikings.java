package sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Квест
 *
 * Created by Alexander on 9/16/2014.
 */
@XmlRootElement(name = "quest")
public class Vikings {
    @XmlElementWrapper(name = "QuestList")
    @XmlElement(name = "question")
    private ArrayList<Question> questions;

    public Vikings()
    {
        questions = new ArrayList<Question>();
    }

   public void SetQuestions(ArrayList<Question> qs)
   {
       this.questions = qs;
   }

   public ArrayList<Question> GetQuestions()
   {
       return questions;
   }



}
