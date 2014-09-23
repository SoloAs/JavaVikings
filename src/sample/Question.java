package sample;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Alexander on 9/16/2014.
 */
public class Question {
    @XmlElement(name = "question")
    private String question;
    @XmlElement(name = "YesId")
    private int yesId;
    @XmlElement(name = "NoId")
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
