package programmingchallenge3_2;
import javax.swing.JOptionPane;

public class ProgrammingChallenge3_2 {
    public static void main(String[] args) {

    int dayLmt;

    String monthStr = JOptionPane.showInputDialog("Please input a month in numeric form:\n" + "(Ex, January = 1)");
    int month = Integer.valueOf(monthStr);

    if ((month < 1) || (month > 12))
    {
        JOptionPane.showMessageDialog(null, "Invalid input, defaulted to June (6)");
        month = 6;
    }

    switch (month)
    {
        case 2:
            dayLmt = 28;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            dayLmt = 30;
            break;
        default:
            dayLmt = 31;
    }

    String dayStr = JOptionPane.showInputDialog("Please input a day of that month:\n" + "(Ex, 6, 12, 25, etc.)");
    int day = Integer.valueOf(dayStr);

    if ((day < 1) || (day > dayLmt))
    {
        JOptionPane.showMessageDialog(null, "Invalid input, defaulted to 10");
        day = 10;
    }

    String yearStr = JOptionPane.showInputDialog("Please input a 2-digit year:\n" + "(Ex, 1994 = 94)");
    int year = Integer.valueOf(yearStr);

    if ((year < 1) || (year > 99))
    {
        JOptionPane.showMessageDialog(null, "Invalid input, defaulted to 1960 (60)");
        year = 60;
    }

    int mdTot = (month * day) % 100;

    if (mdTot == year)
        System.out.printf("The date %d/%d/%d is magic!", month, day, year);
    else
        System.out.printf("The date %d/%d/%d is not magic...", month, day, year);
    }
}
