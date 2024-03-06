import java.util.Random;

public class DmvSimulator
{
    public static void main (String[] args)
    {
        System.out.println("Welcome to the DMV");

        Random random = new Random();
        int userNumber = random.nextInt(100) + 1;
        System.out.println("Your number is: " + userNumber + ". Please wait until your number is called.");

        //Call out each number, starting from the one after the user's, wrapping around, and ending with the user's number
        for (int i = userNumber + 1; i != userNumber; i++)
        {
            if (i > 100)
            {
            //Wrap around if the number exceeds 100
            i = 1;
            }
            System.out.println("Now serving number: " + i);
        }
        System.out.println("Now serving number: " + userNumber);
        System.out.println("Sorry, you do not have the required paperwork.");
    }
}