package Biudzetas2;

import java.util.ArrayList;

public class Budget {

    private ArrayList<Incomes> incomes = new ArrayList<>();
    private ArrayList<Expenses> expenses = new ArrayList<>();

    public void addIncome(Incomes income) {
        if (income == null) {
            return;
        }
        incomes.add(income);
    }

    public void addExpenses(Expenses expense) {
        if (expenses == null) {
            return;
        }
        expenses.add(expense);
    }

    public ArrayList<Incomes> getIncomes() {
        return incomes;
    }

    public ArrayList<Expenses> getExpenses() {
        return expenses;
    }

    public void displayIncomes() {
        System.out.println("\nAll Incomes:");
        for (int i = 0; i < incomes.size(); i++) {
            if (incomes.get(i) != null) {
                System.out.println(incomes.get(i));
            }
        }
    }

    public void displayExpenses() {
        System.out.println("\nAll Expenses:");
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) != null) {
                System.out.println(expenses.get(i));
            }
        }
    }

    public double balance() {
        int sum = 0;
        for (int i = 0; i < incomes.size(); i++) {
            if (incomes.get(i) != null) {
                sum += incomes.get(i).getSum();
            }
        }
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) != null) {
                sum -= expenses.get(i).getSum();
            }
        }
        return sum;
    }

    public boolean deleteIncome(int number) {
        for (int i = 0; i < incomes.size(); i++) {
            if (incomes.get(i) != null) {
                if (incomes.get(i).getNumber() == number) {
                    incomes.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteExpense(int number) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) != null) {
                if (expenses.get(i).getNumber() == number) {
                    expenses.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

}
