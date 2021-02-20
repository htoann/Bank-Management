import java.util.ArrayList;

import java.util.Scanner;

public class Vietcombank {

    ArrayList<TermBook> listTermBook 
    = new ArrayList<>();

    ArrayList<NonTermBook> listNonTermBook 
    = new ArrayList<>();
    
    ArrayList<String> listCitizenNum 
    = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void In() {

        int choose;

        do {
            System.out.println("\n------- Menu -------");
            System.out.println("1. Term Book\n" + 
            "2. Non Term Book\n" + 
            "3. Exit");

            // Select a function in the menu
            choose = sc.nextInt();
            Boolean check;

            sc.nextLine();

            // Term book
            if (choose == 1) {

                TermBook x = new TermBook();
                
                do {
                    check = true;
                    System.out.println("Enter Citizens Number: ");
                    x.citizenNum = sc.nextLine();

                    // Check Citizens number duplicate
                    int n = listCitizenNum.size();
                    for (int i = 0; i < n; i++) {
                        if (listCitizenNum.get(i).
                        equals(x.citizenNum)) {
                            check = false;
                            break;
                        }
                    }
                    
                } while (check == false);

                listCitizenNum.add(x.citizenNum);
                
                // Enter Informations of Term Book
                x.In();
                listTermBook.add(x);
            }

            // NonTerm Book
            if (choose == 2) {

                NonTermBook x = new NonTermBook();

                do {
                    check = true;
                    System.out.println("Enter Citizen's Number: ");
                    x.citizenNum = sc.nextLine();

                    // // Check if Citizens number has duplicates
                    int n = listCitizenNum.size();
                    for (int i = 0; i < n; i++) {
                        if (listCitizenNum.get(i).
                        equals(x.citizenNum)) {
                            check = false;
                            break;
                        }
                    }
                } while (check == false);

                listCitizenNum.add(x.citizenNum);

                // Enter Informations of NonTerm Book
                x.In();
                listNonTermBook.add(x);
            }

        } while (choose != 3);
    }

    public void Out() {

        int n = listTermBook.size();
        for (int i = 0; i < n; i++) {
            System.out.println("\nUser " + (i + 1));
            System.out.println("Citizens Number: " + 
            listTermBook.get(i).getCitizenNum());
            listTermBook.get(i).Out();
        }

        int m = listNonTermBook.size();
        for (int j = 0; j < m; j++) {
            System.out.println("\nUser " + (n + j + 1));
            System.out.println("Citizens Number: " + 
            listNonTermBook.get(j).getCitizenNum());
            listNonTermBook.get(j).Out();
        }
    }

    // Total interest payable by the bank
    public float ToTalInterest() {

        float total = 0;

        int n = listTermBook.size();
        for (int i = 0; i < n; i++) {
            total += listTermBook.get(i).InterestCal();
        }

        int m = listNonTermBook.size();
        for (int i = 0; i < m; i++) {
            total += listNonTermBook.get(i).InterestCal();
        }
        return total;
    }
}
