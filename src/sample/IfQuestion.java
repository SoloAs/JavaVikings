package sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Alexander on 9/16/2014.
 */
@XmlRootElement(name = "IfQuestion")
@XmlType(propOrder = {"yesId", "noId"})
public class IfQuestion extends Question{

    @XmlElement(name = "YesId")
    public int getYesId() {return yesId;}
    private int yesId;

    @XmlElement(name = "NoId")
    public int getNoId() {return noId;}
    private int noId;

    public IfQuestion()
    {
        setQuestion("");
        yesId = -1;
        noId = -1;
        setId(-1);
    }

    public IfQuestion(String q, int y, int n, int i)
    {
        setQuestion(q);
        yesId = y;
        noId = n;
        setId(i);
   //     gotVariants = gv;
    }

}
