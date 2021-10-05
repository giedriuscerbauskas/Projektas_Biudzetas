package Biufzetas;
/*
vaikine klase
turi interest rate
ir metoda skirta pritaikyti interest - pelnas
 */
public class IslaiduIrasas extends Programa{

    //interest rate
    private double interestRate;

    //default konstruktorius
    public IslaiduIrasas() {
        super();
    }

    /*
    konstruktorius kad priskirti islaiduIrasui kazkoki tai saskaitos numeri ir interest rate
     */
    public IslaiduIrasas(int saskaitosNumeris, double interestRate) {
        super(saskaitosNumeris);
        this.interestRate = interestRate;
    }

    //geterio funkcija
    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balansas * interestRate;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.printf("Inerest suma %.2f prideda prie balansas%n", interest);
        inasas(interest);
    }

    //abstraktus metodai
    /* funkcija inesti pajamas i saskaita tol kol suma > 0
     */
    public void inasas(double suma) {
        //pirma tikrinam likuti
        if ( suma > 0 ){

            balansas += suma;
            System.out.printf("Suma %.2f inesta%n", suma);
            System.out.printf("Dabartinis likutis yra: %.2f%n", balansas);

        } else {
            System.out.println("neigiama suma negali buti inesta");
        }

    }

    /*funkcija isimti pinigus is saskaitos tol kol
    1. isemimo suma turi buti > 0
    2. isemimo suma turi buti <= balansui
     */
    public void isemimas(double suma) {

        //vel tikrinam
        if(suma > 0) {
            //CHECK SUFFICIENT BALANCE
            if ((suma) <= balansas ) {

                System.out.printf("Suma %.2f isimta is Saskaitos%n", suma);
                balansas -= suma;
                System.out.printf("Dabartinis balansas yra: %.2f%n", balansas);

            }

        } else {
            System.out.println("Neigiama suma negali buti isimta!");
        }

    }

}
