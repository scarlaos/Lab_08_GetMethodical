import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempF = 0.00;
        tempF = CtoFDouble(in, "Enter a temperature is C");
        System.out.println("Your conversion from C to F is: " + tempF + " degrees");
    }

    public static double CtoFDouble(Scanner pipe, String prompt) {
        double cVal = 0.0;
        double fVal = 0.0;
        boolean done = false;

        while (!done) {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                cVal = pipe.nextDouble();
                fVal = 9 / 5.0 * cVal + 32;
                done = true;
            } else {
                System.out.println("Invalid input: " + pipe.next());
            }
        }
        return fVal;
    }

}
