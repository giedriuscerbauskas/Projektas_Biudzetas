package Biudzetas;

public class Budget {

    private Incomes[] incomes = new Incomes[100];
    private Expenses[] expenses = new Expenses[100];

    public void addIncome(Incomes income) {
        if (income == null) {
            return;
        }
        for (int i = 0; i < 100; i++) {
            if (incomes[i] == null) {
                incomes[i] = income;
                return;
            }
        }
    }

    public void addExpenses(Expenses expense) {
        if (expenses == null) {
            return;
        }
        for (int i = 0; i < 100; i++) {
            if (expenses[i] == null) {
                expenses[i] = expense;
                return;
            }
        }
    }

    public Incomes[] getIncomes() {
        return incomes;
    }

    public Expenses[] getExpenses() {
        return expenses;
    }

}

