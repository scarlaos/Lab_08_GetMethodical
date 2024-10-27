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
    public static int getRangedYearInt(Scanner pipe, String prompt, int low, int high)
    {
        int birthYear = 0;
        boolean validInput = false;

        do{
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                birthYear = pipe.nextInt();
                pipe.nextLine();
                if(birthYear >= low && birthYear <= high)
                {
                    validInput = true;
                }else
                {
                    System.out.println("\nNumber is out of the range,[" + low + " - " + high + "], it can not be: " + birthYear);
                }
            }

        }while(!validInput);
        return birthYear;
    }

    public static int getRangedMonthInt(Scanner pipe, String prompt,int low, int high)
    {
        int birthMonth = 0;
        boolean validInput = false;

        do{
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                birthMonth = pipe.nextInt();
                pipe.nextLine();
                if(birthMonth >= low && birthMonth <= high)
                {
                    validInput = true;
                }else
                {
                    System.out.println("\nNumber is out of the range,[" + low + " - " + high + "], it can not be: " + birthMonth);
                }
            }

        }while(!validInput);
        return birthMonth;
    }
    public static int getRangedDayInt(Scanner pipe, String prompt,int birthMonth, int birthYear) {
        int birthDay = 0;
        boolean validInput = false;
        int maxDays = getMaxDaysInMonth(birthMonth, birthYear);

        do {
            System.out.print("\n" + prompt + "[1 - " + maxDays + "]: ");
            if (pipe.hasNextInt()) {
                birthDay = pipe.nextInt();
                pipe.nextLine();
                if (birthDay >= 1 && birthDay <= maxDays) {
                    validInput = true;
                } else {
                    System.out.println("\nNumber is out of the range,[1 - " + maxDays + "], it can not be: " + birthDay);
                }
            }else
                System.out.println("Not a integer. Please enter an integer. ");
            pipe.next();

        } while (!validInput);
        return birthDay;
    }
    private static int getMaxDaysInMonth(int month, int year)
    {
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (isLeapYear(year))? 29 : 28;
            default:
                return 0;
        }
    }

    private static boolean isLeapYear(int year) // leap year for my sanity
    {
        return(year %4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getRangedHourInt(Scanner pipe, String prompt,int low, int high)
    {
        int birthHour = 0;
        boolean validInput = false;

        do{
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                birthHour = pipe.nextInt();
                pipe.nextLine();
                if(birthHour >= low && birthHour <= high)
                {
                    validInput = true;
                }else
                {
                    System.out.println("\nNumber is out of the range,[" + low + " - " + high + "], it can not be: " + birthHour);
                }
            }

        }while(!validInput);
        return birthHour;
    }

    public static int getRangedMinuteInt(Scanner pipe, String prompt,int low, int high)
    {
        int birthMinute = 0;
        boolean validInput = false;

        do{
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                birthMinute = pipe.nextInt();
                pipe.nextLine();
                if(birthMinute >= low && birthMinute <= high)
                {
                    validInput = true;
                }else
                {
                    System.out.println("\nNumber is out of the range,[" + low + " - " + high + "], it can not be: " + birthMinute);
                }
            }

        }while(!validInput);
        return birthMinute;
    }
}
