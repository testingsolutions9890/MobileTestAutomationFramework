package Utils;

import java.util.List;
import java.util.Locale;

public class StringUtils {

    //convert string to int
    public static String getStringFromInt(int input){
        String output = Integer.toString(input);
        return output;
    }
    // get substring
    public static String getSubString(String input,int inbound, int outbound){
        String output = input.substring(inbound,outbound);
        return output;
    }

    // split the string
    public static List<String> getSplittedStringInListFormat(String input, String split){
       List<String> list  = List.of(input.split(split));
        return list;
    }

    // convert the upper case to lower case
    public static String convertUpperCaseToLowerCase(String input){
        String output = input.toLowerCase(Locale.ENGLISH);
        return output;
    }

    // convert the lower case to upper case
    public static String convertLowerCaseToUpperCase(String input){
        String output = input.toUpperCase(Locale.ENGLISH);
        return output;
    }

    //get random string
    /*public static String getRandomString(){
        String input = "random";
        String output = NumbersUtils.getRandomNumberWithRangeInteger(1,100)+ input;
        return output;
    }*/
}
