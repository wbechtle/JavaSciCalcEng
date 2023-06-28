//Name: Wyatt Bechtle
//Date: 9 May 2023
//Program: Scientific Calculator Class
//----------------------------------------
//This Class provides methods for basic arithmetic and some trigonometric functions.
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.lang.Math;

public class SciCalc {

    //Class CONSTANTS...
    static final BigDecimal PI = new BigDecimal("3.14159").setScale(5, RoundingMode.CEILING);   //Big decimal used to
    static final BigDecimal EULER = new BigDecimal("2.71828").setScale(5, RoundingMode.CEILING);//increase precision. 

    //No arguement constructor.
    public SciCalc() {
    }
    //Addition "Provides the ability to add two numbers together and produce a sum."
    public static BigDecimal Addition(BigDecimal valueOne, BigDecimal valueTwo) {
        BigDecimal result = valueOne.add(valueTwo);
        return result.setScale(5, RoundingMode.CEILING).stripTrailingZeros();
    }
    //Subtraction "Provides the ability to subtract two numbers together to produce a 
    //              difference"
    public static BigDecimal Subtraction(BigDecimal valueOne, BigDecimal valueTwo) {
        BigDecimal result = valueOne.subtract(valueTwo);
        return result.setScale(5, RoundingMode.CEILING).stripTrailingZeros();    
    }
    //Multiplication "Provides the ability to multiply two numbers together and produce 
    //                  a product."
    public static BigDecimal Multiplication(BigDecimal valueOne, BigDecimal valueTwo) {
        BigDecimal result = valueOne.multiply(valueTwo);
        return result.setScale(5, RoundingMode.CEILING).stripTrailingZeros();    
    }
    //Division "Provides the ability to divide two numbers and produce a quotient."
    public static BigDecimal Division(BigDecimal valueOne, BigDecimal valueTwo) {
        BigDecimal result = valueOne.divide(valueTwo, 5, RoundingMode.CEILING);
        return result.setScale(5, RoundingMode.CEILING).stripTrailingZeros();    
    }
    //Square "Provides the ability to square an entered number."
    public static BigDecimal Square(BigDecimal value) {
        BigDecimal result = value.pow(2);
        return result.setScale(5, RoundingMode.CEILING).stripTrailingZeros();
    }
    //Square Root "Provides the ability to determine the square root of an entered number."
    public static BigDecimal SqRt(BigDecimal value) {
        return value.sqrt(new MathContext(5, RoundingMode.CEILING)).stripTrailingZeros();
    }
    //Sin "Provides the ability to determine the sine value of an entered number."
    public static BigDecimal Sin(BigDecimal value) {
        //Convert value to radians and calculate sine.
        return new BigDecimal(Math.sin(Math.toRadians(value.doubleValue()))).setScale(5, RoundingMode.CEILING).stripTrailingZeros();
    }
    //Cos "Provides the ability to determine the cosine value of an entered number."
    public static BigDecimal Cos(BigDecimal value) {
        //Convert value to radians and calculate cosine.
        return new BigDecimal(Math.cos(Math.toRadians(value.doubleValue()))).setScale(5, RoundingMode.CEILING).stripTrailingZeros();
    }
    //Tan "Provides the ability to determine the tangent value of an entered number."
    public static BigDecimal Tan(BigDecimal value) {
        //Convert value to radians and calculate tangent.
        return new BigDecimal(Math.tan(Math.toRadians(value.doubleValue()))).setScale(5, RoundingMode.CEILING).stripTrailingZeros();
    }
}