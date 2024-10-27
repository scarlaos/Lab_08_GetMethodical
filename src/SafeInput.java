import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe,String prompt)
    {
        String nonZeroLength = "";
        do{
            System.out.print("\n" + prompt + ": ");
            nonZeroLength = pipe.nextLine();

            if(nonZeroLength.length() == 0)
            {
                System.out.println("\nYou must enter some characters! ");
            }
        }while(nonZeroLength.isEmpty());
        return nonZeroLength;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int theInt = 0;
        boolean validInput = false;

        while(!validInput)
        {
            System.out.println("\n" + prompt + ": ");

            if(pipe.hasNextInt())
            {
                theInt = pipe.nextInt();
                validInput = true;
            }
            else {
                System.out.println("Invalid input. Enter a integer. ");
                pipe.next();
            }
        }
        return theInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double theDouble = 0.0;
        boolean validInput = false;

        while(!validInput)
        {
            System.out.println("\n" + prompt + ": ");

            if(pipe.hasNextDouble())
            {
                theDouble = pipe.nextDouble();
                validInput = true;
            }
            else {
                System.out.println("Invalid input. Enter a double. ");
                pipe.next();
            }
        }
        return theDouble;
    }
}
