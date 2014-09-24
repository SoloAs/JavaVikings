package sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Интерфейс элементов квеста
 *
 * Created by Alexander on 9/24/2014.
 */

@XmlRootElement(name = "Question")
@XmlSeeAlso({Block.class, IfQuestion.class})

public abstract class Question {

    public Question()
    {
        setId(-1);
        setQuestion("");
    }

    public Question(String q, int i)
    {
        setId(i);
        setQuestion(q);
    }

    private int id;
    @XmlElement(name = "Id")
    public int getId() {return id;}
    public void setId(int value) { this.id = value; }



    private String question;
    @XmlElement(name = "question")
    public String getQuestion() {return question;}
    public void setQuestion(String value) { this.question = value; }



}
