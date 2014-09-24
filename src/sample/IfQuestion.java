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

    public IfQuestion()
    {
        setQuestion("");
        setYesId(-1);// = -1;
        setNoId(-1);// = -1;
        setId(-1);
    }

    public IfQuestion(String q, int y, int n, int i)
    {
        setQuestion(q);
        setYesId(y);//yesId = y;
        setNoId(n);//noId = n;
        setId(i);
        //     gotVariants = gv;
    }

    private int yesId;
    @XmlElement(name = "YesId")
    public int getYesId() { return yesId; }
    public void setYesId(int value) { this.yesId = value; }



    private int noId;
    @XmlElement(name = "NoId")
    public int getNoId() { return noId; }
    public void setNoId(int value) { this.noId = value; }




}
