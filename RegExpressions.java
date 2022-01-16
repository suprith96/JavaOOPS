
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExpressions {

public static void main(String args[])
 {

     Pattern pattern = Pattern.compile("string");
     Matcher m = pattern.matcher("stringfromsetofstrings");

    while (m.find())

         // Print starting and ending indexes
         // of the pattern in the text
         // using this functionality of this class
         System.out.println("Pattern found from "
                            + m.start() + " to "
                            + (m.end() - 1));
 }
}