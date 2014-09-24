package sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Элемент квеста без вариантов ответа.
 *
 * Created by Alexander on 9/24/2014.
 */

@XmlRootElement(name = "Block")
public class Block extends Question {
    public Block()
    {
        setQuestion("");
        setId(-1);
        setNextId(-1);
    }

    public Block(String q, int i, int j)
    {
        setQuestion(q);
        setId(i);
        setNextId(j);
    }


    private int nextId;
    @XmlElement(name = "nextId")
    public int getNextId() { return nextId; }
    public void setNextId(int value) { nextId = value; }

}
