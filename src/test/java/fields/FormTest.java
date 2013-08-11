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
        Field f = new LineTextField("asd", 1);
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

    @Test
    public void testJson() throws Exception {

    }

    @Test
    public void testGenerateHtml() throws Exception {
        Form f = new Form();
        f.addField(new FieldHeader("Hello World", 1));
        f.addField(new LongTextField("What is this?", 250));
        CheckBoxField cb = new CheckBoxField();
        cb.addOption("Opt1");
        cb.addOption("Opt2");
        cb.addOption("Opt3");
        cb.addOption("Opt4");

        RadioField cb2 = new RadioField();
        cb2.addOption("Opt1");
        cb2.addOption("Opt2");
        cb2.addOption("Opt3");
        cb2.addOption("Opt4");

        RadioField cb3 = new RadioField();
        cb3.addOption("Opt1");
        cb3.addOption("Opt2");
        cb3.addOption("Opt3");
        cb3.addOption("Opt4");

        f.addField(new FieldHeader("Which Option?", 3));
        f.addField(cb);
        f.addField(cb3);
        f.addField(cb2);
        f.addField(new LineTextField("What is your name?", 5));
        f.addField(new FieldHeader("Thanks for testing!", 4));
        System.out.println(f.generateFormHtml());
    }
}
