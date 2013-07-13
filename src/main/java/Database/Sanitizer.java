package Database;

import org.owasp.validator.html.*;

public class Sanitizer {
    public static final String POLICY_FILE_LOCATION_LONG  = "antisamy-long.xml";
    public static final String POLICY_FILE_LOCATION_SHORT  = "antisamy-short.xml";
    public static CleanResults sanitizeLongText(String unclean) throws PolicyException, ScanException {
        Policy policy = Policy.getInstance(POLICY_FILE_LOCATION_LONG);
        AntiSamy as = new AntiSamy();
        return as.scan(unclean, policy);
    }

    public static CleanResults sanitizeShortText(String unclean) throws PolicyException, ScanException {
        Policy policy = Policy.getInstance(POLICY_FILE_LOCATION_SHORT);
        AntiSamy as = new AntiSamy();
        return as.scan(unclean, policy);
    }
}
