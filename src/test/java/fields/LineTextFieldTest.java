package fields;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/25/13
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineTextFieldTest {
    @Test
    public void testSerial() {
        System.out.println("ASD");
        LineTextField f = new LineTextField();
        f.setFieldName("HELLO");
        f.setMaxChars(100);
        try {
            FileOutputStream fos = new FileOutputStream("testfile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(f);
            oos.flush();
            oos.close();
            Field read;
            FileInputStream fis = new FileInputStream("testfile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            read = (LineTextField)ois.readObject();
            ois.close();
            if(read instanceof LineTextField) {
                System.out.println(f.getFieldName());
            }
        } catch(Exception e)
        {}
    }
}
