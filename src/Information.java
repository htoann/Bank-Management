import java.util.Scanner;
import java.util.Calendar;

public class Information {

    String citizenNum, Name;
    long Deposits;
    double interestRate;
    Day bookDate = new Day();
    Scanner sc = new Scanner(System.in);

    public void In() {

        System.out.println("Enter Name: ");
        Name = sc.nextLine();

        do {
            System.out.println("Enter Deposits(VND): ");
            Deposits = sc.nextLong();

            if(Deposits < 999999) {
                System.out.println("Deposits must be one million or more");
            }

        } while(Deposits < 999999);

        do {
            System.out.println("Enter Interestrate(%): ");
            interestRate = sc.nextDouble();

            if(interestRate < 0) {
                System.out.println("Error Interestrate, please retype!");
            }

        } while(interestRate < 0);

        System.out.print("Enter Book Date");
        bookDate.In();
    }

    public void Out() {
        
        System.out.println("Name: " + Name);
        System.out.println("Deposits: " + Deposits + " VND");
        System.out.println("Interestrate: " + interestRate + "%");
        System.out.print("Book Date: ");
        bookDate.Out();
        System.out.println("Sent for " + monthSent() + " months");
    }

    // Calculates the number of months actually sent to the bank
    public int monthSent() {
        int n;

        Calendar cal = Calendar.getInstance();
        int dayNow = cal.get(Calendar.DAY_OF_MONTH);
        int monthNow = cal.get(Calendar.MONTH);
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int day = bookDate.getDay();
        int month = bookDate.getMonth();
        int year = bookDate.getYear();

        n = 12 * (yearNow - year);
        if(month < monthNow) {
            n += monthNow - month;
        }
        else n -= month - monthNow;
        if(day >= dayNow) {
            n++;
        }

        return n;
    }

    public String getCitizenNum() {
        return citizenNum;
    }

    public void setCitizenNum(String citizenNum) {
        this.citizenNum = citizenNum;
    }
}
