public class TermBook extends Information {
    Information info = new Information();
    int KyHanGui;

    public void In() {
        info.In();
        System.out.println("How many months? (Period)");
        KyHanGui = sc.nextInt();
    }

    public void Out() {
        info.Out();
    }
    
    public double InterestCal() {
        if(info.monthSent() >= KyHanGui) {
            return info.Deposits * info.interestRate / 100 * info.monthSent();
        }
        return 0;
    }
}
