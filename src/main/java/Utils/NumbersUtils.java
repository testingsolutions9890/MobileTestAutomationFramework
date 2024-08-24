package Utils;

import java.math.RoundingMode;
import java.util.Random;

public class NumbersUtils {

    // create random number : given the start and end number
    /*public static int getRandomNumberWithRangeInteger(int inBound, int outBound){
        Random random = new Random();
        int randomInt = random.nextInt(inBound,outBound);
        return randomInt;
    }*/

    // convert string to number
    public static int stringToIntFormat(String input){
        int output = Integer.valueOf(input);
        return output;
    }

    // get round off of float
    public static int getRoundOffIntValueOfFloat(float input){
        int output = Math.round(input);
        return output;
    }

    // get round off of Double
    public static Double getRoundOffIntValueOfFloat(Double input){
        Double output = (double) Math.round(input);
        return output;
    }

    //ascending order int from list
    // descending order int from list

   /* public static void main(String[] arges){
       getRandomNumberWithRangeInteger(1,100);
    }*/

}
