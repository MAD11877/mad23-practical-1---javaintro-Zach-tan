import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    System.out.print("Enter number of integers: ");
    Scanner inNum = new Scanner(System.in);
    int num = inNum.nextInt();

    ArrayList<Integer> ints = new ArrayList<>();

    for (int i = 0; i < num; i ++)
    {
      Scanner inInt = new Scanner(System.in);
      int numInt = inInt.nextInt();

      ints.add(numInt);
    }

    int mode = ints.get(0);
    int maxCount = 0;
    for (int i = 0; i < ints.size(); i++)
    {
      int count = 0;
      int value = ints.get(i);
      for (int j = 0; j < ints.size(); j++)
      {
        if (ints.get(j)== value)
        {
          count++;
        }
        if (count > maxCount)
          {
            mode = value;
            maxCount = count;
          }
      }
    }
    System.out.print("Mode: " + mode + "\nOccurences: " + maxCount);
  }
}
  
