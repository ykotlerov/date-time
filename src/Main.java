import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите дату рождения в формате (DD.MM.YYYY) : ");
        String birthday = in.nextLine();
        
        String [] strings = birthday.split("\\.");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(strings[2]),Integer.parseInt(strings[1])-1,Integer.parseInt(strings[0]));

        Calendar calendarNow = Calendar.getInstance();
        byte i = 0;
        System.out.println("№            Дата            День недели ");
        while (calendar.compareTo(calendarNow) < 1 )
        {
            System.out.println(i + getYearAndDayOfWeek(calendar));
            calendar.add(Calendar.YEAR,1); i++;
        }

    }

    public static String getYearAndDayOfWeek (Calendar calendar)
    {
        return new SimpleDateFormat("    |    dd.MM.yyyy     |    EEEE").format(calendar.getTime());
    }

}