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
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckBoxFieldTest {
    @Test
    public void testSerial() throws Exception{
        System.out.println("ASD");
        CheckBoxField f = new CheckBoxField();
        f.addOption("Test1");
        f.addOption("Test2");
        FileOutputStream fos = new FileOutputStream("testfile");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(f);
        oos.flush();
        oos.close();
        CheckBoxField read;
        FileInputStream fis = new FileInputStream("testfile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        read = (CheckBoxField)ois.readObject();
        ois.close();
        System.out.println(read.getOptions());
    }

    @Test
    public void testGenerateHTML() throws Exception {
        CheckBoxField f = new CheckBoxField();
        f.addOption("Test1");
        f.addOption("Test2");
        System.out.println(f.generateHtml());
    }
}
