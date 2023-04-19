import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    System.out.print("Enter height: ");
    Scanner inHeight = new Scanner(System.in);
    double height = inHeight.nextDouble();

    System.out.print("Enter weight: ");
    Scanner inWeight = new Scanner(System.in);
    double weight = inWeight.nextDouble();

    System.out.format("BMI: %.2f",weight/(height*height));
  }
}
