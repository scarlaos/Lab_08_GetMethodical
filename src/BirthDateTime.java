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

        birthYear = SafeInput.getRangedYearInt(in, "Enter your birth year", 1950,2015);
        birthMonth = SafeInput.getRangedMonthInt(in, "Enter your birth month", 1,12);
        birthDay = SafeInput.getRangedDayInt(in,"Enter you birth day, if program does not continue,backspace and retype a proper day for your month",1,31);
        birthHour = SafeInput.getRangedHourInt(in,"Enter the hour you were born",1,24);
        birthMinute = SafeInput.getRangedMinuteInt(in,"Enter the minute you were born",1,59);

        System.out.println("You were born in " + birthYear + " on month " + birthMonth + ", day " + birthDay + ", hour " + birthHour + ", and minute " + birthMinute);
    }
}
