import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class New {

// Java program to validate
// CVV (Card Verification Value)
// number using regex.

    class GFG {

        // Function to validate
        // CVV (Card Verification Value) number.
        // using regular expression.
        public static boolean isValidCVVNumber(String str)
        {
            // Regex to check valid CVV number.
            String regex = "^[0-9]{3,4}$";

            // Compile the ReGex
            Pattern p = Pattern.compile(regex);

            // If the string is empty
            // return false
            if (str == null)
            {
                return false;
            }

            // Find match between given string
            // and regular expression
            // using Pattern.matcher()

            Matcher m = p.matcher(str);

            // Return if the string
            // matched the ReGex
            return m.matches();
        }

        // Driver code
        public static void main(String args[])
        {

            // Test Case 1:
            String str1 = "561";
            System.out.println(isValidCVVNumber(str1));

            // Test Case 2:
            String str2 = "5061";
            System.out.println(isValidCVVNumber(str2));

            // Test Case 3:
            String str3 = "50614";
            System.out.println(isValidCVVNumber(str3));

            // Test Case 4:
            String str4 = "5a#1";
            System.out.println(isValidCVVNumber(str4));
        }
    }
}
