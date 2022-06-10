package cap.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codoid-pc on 6/20/2018.
 */
public class PatternHandlerUtil {

    public static String getFirstMatch(String strPattern, String strValue) {
        String strFirstMatch = strValue;
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(strValue);
        if (matcher.find()) {
            strFirstMatch = matcher.group();
        }
        return strFirstMatch;
    }

    public static String getMatchContent(String strPattern, String strValue) {
        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(strValue);
        String strData = "";
        if (m.find()) {
            strData = m.group(1);
        }
        return strData;
    }
}
