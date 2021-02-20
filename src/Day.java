import java.util.Scanner;

public class Day {
    int day;
    int month;
    int year;
    Scanner sc = new Scanner(System.in);

    public void In() {
        System.out.print("(d/m/y): ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
    }

    public void Out() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
