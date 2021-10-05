package Biudzetas;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Budget b1 = new Budget();
        boolean quit = false;
        while (quit == false) {
            System.out.println("Menu");
            System.out.println("1: Pridekite pajamas");
            System.out.println("2: Pridekite islaidas");
            System.out.println("3: Parodyti visas pajamas");
            System.out.println("4: Parodyti visas islaidas");
            System.out.println("0: Iseiti");
            String option = scanner.nextLine().trim();
            switch (option) {
                case "1": {
                    System.out.print("\nIveskite suma: ");
                    double sum = Double.valueOf(scanner.nextLine().trim());
                    System.out.print("Iveskite data: ");
                    String date = scanner.nextLine().trim();
                    System.out.print("Iveskite kategorijos indeksa: ");
                    String category = scanner.nextLine().trim();
                    System.out.print("Ar pinigai gauti i banko saskaita?: ");
                    String didMoneyCameToBankAccount = scanner.nextLine().trim();
                    System.out.print("Papildoma informacija: ");
                    String additionalInfo = scanner.nextLine().trim();
                    Incomes income = new Incomes(sum, date, category, didMoneyCameToBankAccount, additionalInfo);
                    b1.addIncome(income);
                    System.out.println("\nIplaukos pridetos");
                    break;
                }
                case "2": {
                    System.out.print("\nIveskite suma: ");
                    double sum = Double.valueOf(scanner.nextLine().trim());
                    System.out.print("Iveskite data: ");
                    String date = scanner.nextLine().trim();
                    System.out.print("Iveskite kategorijos indeksa: ");
                    String category = scanner.nextLine().trim();
                    System.out.print("Atsiskaitymo budas: ");
                    String paymentMethod = scanner.nextLine().trim();
                    System.out.print("Papildoma informacija: ");
                    String additionalInfo = scanner.nextLine().trim();
                    Expenses expense = new Expenses(sum, date, category, paymentMethod, additionalInfo);
                    b1.addExpenses(expense);
                    System.out.println("\nIslaidos pridetos");
                    break;
                }
                case "3": {
                    System.out.println("\nVisos iplaukos:");
                    Incomes[] incomes = b1.getIncomes();
                    for (int i = 0; i < incomes.length; i++) {
                        if (incomes[i] != null) {
                            System.out.println(incomes[i]);
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("\nVisos islaidos:");
                    Expenses[] expenses = b1.getExpenses();
                    for (int i = 0; i < expenses.length; i++) {
                        if (expenses[i] != null) {
                            System.out.println(expenses[i]);
                        }
                    }
                    break;
                }
                case "0": {
                    quit = true;
                    break;
                }
                default: {
                    System.out.println("\nError: Pasirinkimas negalimas.");
                }
            }
            System.out.println();
        }
    }
}
