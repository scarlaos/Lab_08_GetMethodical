import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCNumber = "";
        String menuChoice = "";

        SSN = DevTest.getRegExString(in, "Enter your SSN, include hyphens", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + SSN);

        UCNumber = DevTest.getRegExString(in, "Enter your UC Number", "(M|m)\\d{5}$");
        System.out.println("Your UC number is: " + UCNumber);

        menuChoice = DevTest.getRegExString(in, "Choose a menu option: O\tS\tV\tQ", "[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);


    }
}
