package sample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

/**
 * Created by Alexander on 9/16/2014.
 */
public class VikingsHelper {
     public static void write(Vikings vikings) {
        try {
            File file = new File("viks.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Vikings.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(vikings, file);
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Vikings read(String path) {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(Vikings.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Vikings vikings = (Vikings) unmarshaller.unmarshal(file);
            return vikings;

        }
        catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
