package practical.task.pkg2.bmi.by.akash.mehra;
import java.util.Scanner;

public class BMICaluclator {


    public class BMICaluclator {
// The first step I did for this project was to implement the scanner feature. This would enable the user input to be implemented and read.

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name:  "); //This string made here, allows the user to enter their name.
            String name = input.nextLine(); //This has been created for the purpose to allow an output to be given.
            System.out.print("Input weight in kg:  "); //Here, I have used an integer void, as the output of the weight should be in a number.
            double weight = input.nextDouble(); //Here I have double including the input statement. This is done so that the weight can be taken in and shown.
            System.out.print("\nInput height in meters:  "); // Here I have also used another string, this was done so that an input can be taken, of the height from the user. The height needs to be entered with a comma in between.
            double height = input.nextFloat(); // Here, I have used the input.nextFloat technique. This was done for the purpose to show the calculated BMI in a decimal format.

            double bmi = weight / (height * height ); // This is the formula used to calculate the BMI. This is weight divided by height square.

            System.out.print("\nThe body mass index is " + bmi + " kg/m2"); // Here, I have used the system.out.print technique to display what the result is of the calculated BMI of the user.



            // Here below, I have used IF and else if statements. This has been done for the purpose to classify the BMI of the user,
            // I have divided the statements into four categories, the result of the output would determine in which category the user falls into.

            if (bmi <18.5 ) {
                System.out.print(" Underweight");
            }

            else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.print(" Normal");
            }

            else if (bmi >= 25 && bmi < 29.9)  {
                System.out.print(" Overweight");
            }

            else if (bmi >= 30 && bmi < 39.9) {
                System.out.print(" Obese");

            }



        }

    }

}


