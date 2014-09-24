package sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Created by Alexander on 9/24/2014.
 */

@XmlRootElement(name = "Question")
@XmlSeeAlso({Block.class, IfQuestion.class})
public abstract class Question {

    @XmlElement(name = "Id")
    public int getId() {return Id;}
    public void setId(int value) { this.Id = value; }
    private int Id;

    @XmlElement(name = "question")
    public String getQuestion() {return question;}
    public void setQuestion(String value) { this.question = value; }
    private String question;


}
