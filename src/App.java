public class App {
    public static void main(String[] args) throws Exception {
        
        Vietcombank x = new Vietcombank();
        x.In();
        System.out.println("\n----------OUT----------\n");
        x.Out();
        System.out.println("\nTotal Interest Of Vietcombank: " +
            Math.round(x.ToTalInterest())
        );

    }
}