//Name: Wyatt Bechtle
//Date: 9 May 2023
//Program: Test Scientific Calculator Class

//Algorithm
//---------
//Step 1) Display greeting and program explanation.
//Step 2) Display menu.
//Step 3) Prompt user for input.
//Step 4) Respond to user input.
//Step 4) Repeat steps 2 through 4 until user quits program.
import java.util.Scanner;
import java.math.BigDecimal;

//The purpose of this class is to test SciCalc class.
public class TestSciCalc {    
    public static void main(String [] args) {

        //Display greeting and program explanation.
        System.out.println("\nGreetings..." +
                            "\nThis is a text based scientific calculator that calculates" +
                            "\nto the fifth decimal place.");
        //Declare variable to hold user choice.
        String choice;

        //Do while loop used to iterate program and validates user input.
        do {
            //Call the showMenuGetUserInput method and get user input.
            choice = showMenuGetUserInput();
                    
            //Switch statement is used to decide which operation to preform based on user input.
            switch (choice) {
                    
                //Addition.
                case "1":
                    Addition(getBigDecimalValues());//Pipeline methods.                 
                    break;
                    
                //Subtraction.
                case "2":
                    Subtraction(getBigDecimalValues());//Pipeline methods.
                    break;
                    
                //Multiplication.
                case "3":
                    Multiplication(getBigDecimalValues());//Pipeline methods.
                    break;
                    
                //Division.
                case "4":
                    Division(getBigDecimalValues());//Pipeline methods.
                    break;

                //Square.
                case "5":
                    Square(getBigDecimalValue());//Pipeline methods.
                    break;

                //Spuare Root.
                case "6":
                    SquareRoot(getBigDecimalValue());//Pipeline methods.
                    break;

                //Sine.
                case "7":
                    Sine(getBigDecimalValue());//Pipeline methods.
                    break;

                //Cosine.
                case "8":
                    Cosine(getBigDecimalValue());//Pipeline methods.
                    break;

                //Tangant.
                case "9":
                    Tangent(getBigDecimalValue());//Pipeline methods.
                    break;
                    
                //Quit.
                case "10":
                    System.out.println("Good-Bye!");
                    break;
                    
                //If user entered invalid input, display error message with new line for looks.
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (!choice.equals("10"));
        
    }
    //The showMenuGetUserInput method is used to display a menu to the screen and prompt the 
    //user to input an integer value between 1 and 10.
    public static String showMenuGetUserInput() {

        //Create scanner object.
        Scanner scannerObject = new Scanner(System.in);

        //Display the menu.
        System.out.println("\nScientific Calculator" +
                            "\n---------------------" +
                            "\nVariables:  e = EULER" +
                            "\n           pi = PI" +
                            "\n---------------------" +
                            "\nFunctions:" +
                            "\n\t1) Addition" +
                            "\n\t2) Subtraction" +
                            "\n\t3) Multiplication" +
                            "\n\t4) Division" +
                            "\n\t5) Square" +
                            "\n\t6) Square Root" +
                            "\n\t7) Sine" +
                            "\n\t8) Cosine" +
                            "\n\t9) Tangent" +
                            "\n\t10) Quit");

        //Prompt user for input.
        System.out.print("Enter your selection (1-10): ");
        String choice = scannerObject.next();

        //Return user
        return choice;
    }
    //This method is used to get multiple values from the user and returns them as a 
    //BigDecimal array.
    public static BigDecimal[] getBigDecimalValues() {

        //Declare and initialize array and scanner object.
        BigDecimal[] values = new BigDecimal[2];
        Scanner scannerObject = new Scanner(System.in);

        //For loop used to get two values from user.
        for (int i = 0; i < 2; i++) {

            //Declare and initialize variable to control input validation.
            boolean isValidInput = false;

            //While loop used to validate user input.
            while (!isValidInput) {

                //Prompt user for numerical value.
                System.out.print("\nEnter a numerical value for value " + (i + 1) + ": ");
                String input = scannerObject.nextLine();

                //Try block is used to catch invalid input.
                try {
                    //Decision try used to determine if user entered a CONSTANT PI or EULER.
                    if (input.equalsIgnoreCase("pi")) {
                        values[i] = SciCalc.PI;
                        isValidInput = true;//Ends the loop iteration.
                    }
                    else if (input.equalsIgnoreCase("e")) {
                        values[i] = SciCalc.EULER;
                        isValidInput = true;//Ends the loop iteration.
                    }
                    else {
                        values[i] = new BigDecimal(input);
                        isValidInput = true;//Ends the loop iteration.
                    }
                } 
                //Invalid input scenario.
                catch (NumberFormatException exception) {
                    System.out.println("\nInvalid input. Please enter a valid numerical value.");
                }
            }
        }
        return values;//All valid.
    }
    //This method is used to get a value from the user and returns it as a 
    //BigDecimal value.
    public static BigDecimal getBigDecimalValue() {

        //Declare and initialize a BigDecimal variable and a scanner object.
        BigDecimal value = new BigDecimal("0");
        Scanner scannerObject = new Scanner(System.in);

        //Declare and initialize a variable to control input validation loop.
        boolean isValidInput = false;

        //While loop used to validate user input.
        while (!isValidInput) {

            //Prompt user for numerical value.
            System.out.print("\nEnter a numerical value: ");
            String input = scannerObject.nextLine();

            //Try block is used to catch invalid input.
            try {
                //Decision try used to determine if user entered a CONSTANT PI or EULER.
                if (input.equalsIgnoreCase("pi")) {
                    value = SciCalc.PI;
                    isValidInput = true;//Ends the loop iteration.
                }
                else if (input.equalsIgnoreCase("e")) {
                    value = SciCalc.EULER;
                    isValidInput = true;//Ends the loop iteration.
                }
                else {
                    value = new BigDecimal(input);
                    isValidInput = true;//Ends the loop iteration.
                }
            } 
            //Invalid input scenario.
            catch (NumberFormatException exception) {
                System.out.println("\nInvalid input. Please enter a valid numerical value.");
            }
        }
        return value;//valid.
    }
    //This method is used to call the SciCalc Addition method and displays the result.
    public static void Addition(BigDecimal [] values) {
        BigDecimal result = SciCalc.Addition(values[0], values[1]);
        System.out.println("\n" + values[0].stripTrailingZeros().toPlainString() + " + " + 
        values[1].stripTrailingZeros().toPlainString() + " = " + result.toPlainString());
    }
    //This method is used to call the SciCalc Subtraction method and displays the result.
    public static void Subtraction(BigDecimal [] values) {
        BigDecimal result = SciCalc.Subtraction(values[0], values[1]);
        System.out.println("\n" + values[0].stripTrailingZeros().toPlainString() + " - " + 
        values[1].stripTrailingZeros().toPlainString() + " = " + result.toPlainString());
    }
    //This method is used to call the SciCalc Multiplication method and displays the result.
    public static void Multiplication(BigDecimal [] values) {
        BigDecimal result = SciCalc.Multiplication(values[0], values[1]);
        System.out.println("\n" + values[0].stripTrailingZeros().toPlainString() + " * " + 
        values[1].stripTrailingZeros().toPlainString() + " = " + result.toPlainString());
    }
    //This method is used to call the SciCalc Division method, validates user input,
    //and displays the result.
    public static void Division(BigDecimal [] values) {
        
        //While the denominator is equal to zero, display error and prompt user to input again.
        while (values[1].equals(BigDecimal.ZERO)) {
            System.out.println("\nError: Cannot divide by zero.");
            values = getBigDecimalValues();//Call method again for new input.
        }
        //With valid input, calculate and display result.
        BigDecimal result = SciCalc.Division(values[0], values[1]);
        System.out.println("\n" + values[0].stripTrailingZeros().toPlainString() + " / " + 
        values[1].stripTrailingZeros().toPlainString() + " = " + result.toPlainString());
    }
    //This method is used to call the SciCalc Addition method and displays the result.
    public static void Square(BigDecimal value) {
        BigDecimal result = SciCalc.Square(value);
        System.out.println("\nThe square of " + value.stripTrailingZeros().toPlainString() + 
        " is " + result.toPlainString());
    }
    //This method is used to call the SciCalc Addition method and displays the result.
    public static void SquareRoot(BigDecimal value) {
        BigDecimal result = SciCalc.SqRt(value);
        System.out.println("\nThe square root of " + value.stripTrailingZeros().toPlainString() + 
        " is " + result.toPlainString());
    }
    //This method is used to call the SciCalc Addition method and displays the result.
    public static void Sine(BigDecimal value) {
        BigDecimal result = SciCalc.Sin(value);
        System.out.println("\nThe sine of " + value.stripTrailingZeros().toPlainString() + 
        " is " + result.toPlainString());
    }
    //This method is used to call the SciCalc Addition method and displays the result.
    public static void Cosine(BigDecimal value) {
        BigDecimal result = SciCalc.Cos(value);
        System.out.println("\nThe cosine of " + value.stripTrailingZeros().toPlainString() + 
        " is " + result.toPlainString());
    }
    //This method is used to call the SciCalc Addition method and displays the result.
    public static void Tangent(BigDecimal value) {
        BigDecimal result = SciCalc.Tan(value);
        System.out.println("\nThe tangent of " + value.stripTrailingZeros().toPlainString() + 
        " is " + result.toPlainString());
    }

}
