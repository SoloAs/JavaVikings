package sample;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Alexander on 9/16/2014.
 */
public class Question {
    @XmlElement(name = "question")
    public String getQuestion() {return question;}
    private String question;
    @XmlElement(name = "YesId")
    public int getYesId() {return yesId;}
    private int yesId;
    @XmlElement(name = "NoId")
    public int getNoId() {return noId;}
    private int noId;

    public Question()
    {
        question = "";
        yesId = -1;
        noId = -1;
    }

    public Question(String q, int y, int n)
    {
        question = q;
        yesId = y;
        noId = n;
    }

}
