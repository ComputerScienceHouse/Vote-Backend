package fields;

import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/29/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class FormTest {
    public static Form form;
    @Before
    public void setUp() throws Exception {
        form = new Form();
    }

    @Test
    public void testRemoveField() throws Exception {

    }

    @Test
    public void testAddField() throws Exception {

    }

    @Test
    public void testSerial() throws Exception {
        Field f = new LineTextField(1);
        f.setFieldName("SUPER");
        f.setRequired(true);
        form.addField(f);
        FileOutputStream fos = new FileOutputStream("testfile");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(form);
        oos.flush();
        oos.close();
        Form read;
        FileInputStream fis = new FileInputStream("testfile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        read = (Form)ois.readObject();
        ois.close();
    }
}
