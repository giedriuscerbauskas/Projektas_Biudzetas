package Biufzetas;

public abstract class Programa {
    //PaskyrosNumeris
    private int paskyrosNumeris;

    //balansas
    protected double balansas;

    //default konstruktorius
    public Programa() {

    }

    public Programa(int paskyrosNumeris) {
        this.paskyrosNumeris = paskyrosNumeris;
        balansas = 0;
    }

    //geterio metodai


    public double getBalansas() {
        return this.balansas;
    }

    public int getPaskyrosNumeris() {
        return this.paskyrosNumeris;
    }

    //abstraktus metodai
    /* funkcija inesti pajamas i saskaita tol kol suma > 0
     */
    public abstract void inasas(double suma);

    /*funkcija isimti pinigus is saskaitos tol kol
    1. isemimo suma turi buti > 0
    2. isemimo suma turi buti <= balansui
     */
    public abstract void isemimas(double suma);
}
