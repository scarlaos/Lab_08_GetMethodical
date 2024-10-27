import java.util.Objects;
import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthHour = 0;
        int birthMinute = 0;
        int birthDay = 0;

        birthYear = SafeInput.getRangedInt(in,"What is your birth year?", 1950,2015);
        birthMonth = SafeInput.getRangedInt(in,"What is your birth month?",1,12);


        switch(birthMonth){
            case 2:
                birthDay = SafeInput.getRangedInt(in, "What is your birthday?", 1,29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "What is your birthday?",1, 30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in,"What is your birthday?",1,31);
                break;
            default:
                System.out.println("Invalid day: " + birthDay);
                return;
        }
        birthHour = SafeInput.getRangedInt(in,"What is your birth hour?",1,24);
        birthMinute = SafeInput.getRangedInt(in, "What is your birth minute?",1,59);
        System.out.println("Your birthdate is: " + birthMonth + "/" + birthDay + "/" + birthYear + " at: " + birthHour + ":" + String.format("%02d", birthMinute));
    }
}
