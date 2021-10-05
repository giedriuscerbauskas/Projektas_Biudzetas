package Biufzetas;

public class PajamuIrasas extends Programa {
    //default mokestis
    private static double mokestis = 2.5;

    //default konstruktorius
    public PajamuIrasas() {
        super();
    }

    /*
    konstruktorius kad priskirti pajamuIrasui kazkoki tai saskaitos numeri ir operacijos mokessti
     */
    public PajamuIrasas(int saskaitosNumeris, double mokestis) {
        super(saskaitosNumeris);
        mokestis = mokestis;
    }

    //abstraktus metodai
    /* funkcija inesti pajamas i saskaita tol kol suma > 0
     */
    public void inasas(double suma) {
        //pirma tikrinam likuti
        if ( suma > 0 ){

            balansas += suma;
            System.out.printf("Suma %.2f inesta%n", suma);

            //pritaikom operacijos mokesti
            balansas -= mokestis;
            System.out.printf("Mokestis %.2f Nuskaiciuotas%n", mokestis);
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
            if ((suma+mokestis) <= balansas ) {


                System.out.printf("Suma %.2f isimta is Saskaitos%n", suma);
                balansas -= suma;
                balansas -= mokestis;
                System.out.printf("mokestis %.2f nuskaitytas%n", mokestis);
                System.out.printf("Dabartinis balansas yra: %.2f%n", balansas);



            }

        } else {
            System.out.println("Neigiama suma negali buti isimta!");
        }

    }
}
