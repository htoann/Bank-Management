public class NonTermBook extends Information {
    Information info = new Information();
    
    public void In() {
        info.In();
    }

    public void Out() {
        info.Out();
    }

    public double InterestCal() {
        return (info.Deposits * (info.interestRate / 100)) * info.monthSent();
    }
}
