package sample;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Alexander on 9/16/2014.
 */
public class VikingsHelper {
    public static void write(Vikings f, String filename) throws Exception{
        XMLEncoder encoder =
                new XMLEncoder(
                        new BufferedOutputStream(
                                new FileOutputStream(filename)));
        encoder.writeObject(f);
        encoder.close();
    }

    public static Vikings read(String filename) throws Exception {
        XMLDecoder decoder =
                new XMLDecoder(new BufferedInputStream(
                        new FileInputStream(filename)));
        Vikings o = (Vikings)decoder.readObject();
        decoder.close();
        return o;
    }
}
