package Biudzetas2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Budget b1 = new Budget();
        boolean quit = false;
        while (quit == false) {
            System.out.println("Menu");
            System.out.println("1: Prideti pajamas");
            System.out.println("2: Prideti islaidas");
            System.out.println("3: Rodyti visas pajamas");
            System.out.println("4: Rodyti visas islaidas");
            System.out.println("5: Rodyti balansa");
            System.out.println("6: Istrinti iplauka");
            System.out.println("7: Istrinti islaida");
            System.out.println("0: Iseiti");
            String option = scanner.nextLine().trim();
            switch (option) {
                case "1": {
                    System.out.print("\nIveskite suma: ");
                    double sum = Double.valueOf(scanner.nextLine().trim());
                    System.out.print("Iveskite data: ");
                    String date = scanner.nextLine().trim();
                    System.out.print("Iveskite kategorijos Nr.: ");
                    String category = scanner.nextLine().trim();
                    System.out.print("Ar pinigai gauti i banko saskaita?: ");
                    String didMoneyCameToBankAccount = scanner.nextLine().trim();
                    System.out.print("Papildoma informacija: ");
                    String additionalInfo = scanner.nextLine().trim();
                    Incomes income = new Incomes(sum, date, category, didMoneyCameToBankAccount, additionalInfo);
                    b1.addIncome(income);
                    System.out.println("\nPajamos pridetos");
                    break;
                }
                case "2": {
                    System.out.print("\nIveskite suma: ");
                    double sum = Double.valueOf(scanner.nextLine().trim());
                    System.out.print("Iveskite data: ");
                    String date = scanner.nextLine().trim();
                    System.out.print("Iveskite kategorijos Nr.: ");
                    String category = scanner.nextLine().trim();
                    System.out.print("Iveskite mokejimo buda: ");
                    String paymentMethod = scanner.nextLine().trim();
                    System.out.print("Papildoma informacija: ");
                    String additionalInfo = scanner.nextLine().trim();
                    Expenses expense = new Expenses(sum, date, category, paymentMethod, additionalInfo);
                    b1.addExpenses(expense);
                    System.out.println("\nIslaidos pridetos");
                    break;
                }
                case "3": {
                    b1.displayIncomes();
                    break;
                }
                case "4": {
                    b1.displayExpenses();
                    break;
                }
                case "5": {
                    System.out.println("\nBalansas: " + b1.balance());
                    break;
                }
                case "6": {
                    System.out.print("\nIveskite pajamu operacijos numeri kuria norite istrinti: ");
                    int number = Integer.valueOf(scanner.nextLine().trim());
                    if (b1.deleteIncome(number)) {
                        System.out.println("\nPajamu operacija numeris " + number + " istrinta");
                    } else {
                        System.out.println("\nPajamu operacija numeris " + number + " nerasta");
                    }
                    break;
                }
                case "7": {
                    System.out.print("\nIveskite islaidos operacijos numeri kuria norite istrinti: ");
                    int number = Integer.valueOf(scanner.nextLine().trim());
                    if (b1.deleteExpense(number)) {
                        System.out.println("\nIslaidos operacija numeris " + number + " istrinta");
                    } else {
                        System.out.println("\nIslaidos operacija numeris " + number + " nerasta");
                    }
                    break;
                }
                case "0": {
                    quit = true;
                    break;
                }
                default: {
                    System.out.println("\nError: Negalima operacija.");
                }
            }
            System.out.println();
        }
    }
}