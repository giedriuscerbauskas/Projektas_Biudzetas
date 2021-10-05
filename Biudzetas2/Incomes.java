package Biudzetas2;

public class Incomes {

    private static int counter = 1;
    private int number;
    private double sum;
    private String date;
    private String category;
    private String didMoneyCameToBankAccount;
    private String additionalInfo;

    public Incomes(double sum, String date, String category, String didMoneyCameToBankAccount, String additionalInfo) {
        this.number = counter;
        counter++;
        this.sum = sum;
        this.date = date;
        this.category = category;
        this.didMoneyCameToBankAccount = didMoneyCameToBankAccount;
        this.additionalInfo = additionalInfo;
    }

    public double getSum() {
        return sum;
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getDidMoneyCameToBankAccount() {
        return didMoneyCameToBankAccount;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public int getNumber() {
        return number;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDidMoneyCameToBankAccount(String didMoneyCameToBankAccount) {
        this.didMoneyCameToBankAccount = didMoneyCameToBankAccount;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Number: " + number + "\n";
        str += "Sum: " + sum + "\n";
        str += "Date: " + date + "\n";
        str += "Category: " + category + "\n";
        str += "Did Money Came To Bank Account: " + didMoneyCameToBankAccount + "\n";
        str += "Additional Info: " + additionalInfo + "\n";
        return str;
    }

}
