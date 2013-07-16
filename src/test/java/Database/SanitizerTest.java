package Database;

import Utils.Sanitizer;
import org.junit.Test;

public class SanitizerTest {
    @Test
    public void testSanitizeHtmlShort() throws Exception {
        String test = "<a href=#/> <div></div><script language=javascript>alert('hi');</script><p><strong>H</strong></p><br/><p>Hello</p>";
        test = Sanitizer.sanitizeShortText(test).getCleanHTML();
        System.out.println(test);
        assert(!test.contains("script"));
        assert(!test.contains("<p>"));
        assert(!test.contains("<a href = #/>"));
        assert(!test.contains("div"));
    }

    @Test
    public void testSanitizeHtmlLong() throws Exception {
        String test = "<a href = http://www.google.com/> <div></div><script language=javascript>alert('hi');</script><p>Hello World</p><br/><p>Hello</p>";
        test = Sanitizer.sanitizeLongText(test).getCleanHTML();
        assert(!test.contains("script"));
        assert(test.contains("<p>"));
        assert(test.contains("href"));
        assert(!test.contains("div"));
    }

    @Test
    public void testSanitizeHtmlShortLengthMax() throws Exception {
        String test = "";
        for(int i = 0; i < 151; ++i) {
            test += 'c';
        }
        try {
            Sanitizer.sanitizeShortText(test).getCleanHTML();
        } catch (org.owasp.validator.html.ScanException e) {
            return;
        }
        throw new RuntimeException();
    }

    @Test
    public void testSanitizeHtmlLongLengthMax() throws Exception {
        String test = "";
        for(int i = 0; i < 2001; ++i) {
            test += 'c';
        }
        try {
            Sanitizer.sanitizeLongText(test).getCleanHTML();
        } catch (org.owasp.validator.html.ScanException e) {
            return;
        }
        throw new RuntimeException();
    }


    @Test
    public void testSanitizeHtmlLongLengthBelow() throws Exception {
        String test = "";
        for(int i = 0; i < 2000; ++i) {
            test += 'c';
        }
        Sanitizer.sanitizeLongText(test).getCleanHTML();

    }


}
