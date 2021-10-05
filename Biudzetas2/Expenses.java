package Biudzetas2;

public class Expenses {

    private static int counter = 1;
    private int number;
    private double sum;
    private String date;
    private String category;
    private String paymentMethod;
    private String additionalInfo;

    public Expenses(double sum, String date, String category, String paymentMethod, String additionalInfo) {
        this.number = counter;
        counter++;
        this.sum = sum;
        this.date = date;
        this.category = category;
        this.paymentMethod = paymentMethod;
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

    public String getPaymentMethod() {
        return paymentMethod;
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

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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
        str += "Payment Method: " + paymentMethod + "\n";
        str += "Additional Info: " + additionalInfo + "\n";
        return str;
    }

}
