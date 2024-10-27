import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double total = 0;
        boolean done = false;

        while(!done)
        {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item",0.50,10.00);
            total += price;
            boolean repeat = SafeInput.getYN(in,"Would you like to continue?");

            if(repeat == false)
            {
                done=true;
            }
        } System.out.printf("Your total price is $%.2f,", total);
    }
}
