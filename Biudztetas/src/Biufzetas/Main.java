package Biufzetas;
import java.util.Scanner;
public class Main {
    //programos pradzia
    public static void main(String[] args) {
        Scanner klaviatura = new Scanner(System.in);
        //sukuriame saskaitu masyva
        Programa paskyros [] = new Programa[10];

        int pasirinkimas;
        int numPaskyros = 0;

        do {
            pasirinkimas = menu(klaviatura);
            System.out.println();
            if (pasirinkimas == 1) {
                paskyros[numPaskyros++] = sukurtiPaskyra(klaviatura);
            } else if (pasirinkimas == 2) {
                doInasas(paskyros, numPaskyros, klaviatura);
            } else if (pasirinkimas == 3) {
                doIsemimas(paskyros, numPaskyros, klaviatura);
            } else if (pasirinkimas == 4) {
                applyInterest(paskyros, numPaskyros, klaviatura);
            } else {
                System.out.println("viso gero");
            }
            System.out.println();
        } while (pasirinkimas != 5);

    }
        public static int paskyrosMenu(Scanner klaviatura) {
            System.out.println("Pasirinkite paskyros tipa: ");
            System.out.println("1. PajamuIrasas ");
            System.out.println("2. IslaiduIrasas ");

            int pasirinkimas;
            do {
                System.out.print("Iveskite pasirinkima: ");
                pasirinkimas = klaviatura.nextInt();
            } while (pasirinkimas < 1 || pasirinkimas >2);
            return pasirinkimas;
        }
        public static int ieskotiPaskyros(Programa paskyros [], int count, int paskyrosNumeris) {
            for (int i=0; i<count; i++) {
                if(paskyros[i].getPaskyrosNumeris() == paskyrosNumeris) {
                    return i;
                }
            }

            return -1;
        }
    /**
     * funckija inesti inasa i pasirinkta paskyra
     * @param paskyros
     * @param count
     */
    public static void doInasas(Programa paskyros [], int count, Scanner klaviatura) {
        // gauti paskyros numeri
        System.out.print("\nIveskite paskyros numeri :");
        int paskyrosNumeris = klaviatura.nextInt();

        //ieskoti paskyros
        int index = ieskotiPaskyros(paskyros, count, paskyrosNumeris);
        if(index >= 0) {
            //Suma
            System.out.print("Iveskite norima inaso dydi: ");
            double suma = klaviatura.nextDouble();

            paskyros[index].inasas(suma);
        } else {
            System.out.print("Su tokiu paskyros numeriu paskyros nera: " + paskyrosNumeris );
        }
    }

    public static void doIsemimas(Programa paskyros [], int count, Scanner klaviatura) {
        // gauti paskyros numeri
        System.out.print("\nIveskite paskyros numeri :");
        int paskyrosNumeris = klaviatura.nextInt();

        //ieskoti paskyros
        int index = ieskotiPaskyros(paskyros, count, paskyrosNumeris);
        if(index >= 0) {
            //Suma
            System.out.print("Iveskite norima pinigu isemimo suma: ");
            double suma = klaviatura.nextDouble();

            paskyros[index].isemimas(suma);
        } else {
            System.out.print("Su tokiu paskyros numeriu paskyros nera: " + paskyrosNumeris );
        }
    }
        public static void applyInterest(Programa paskyros [], int count, Scanner klaviatura) {
            // gauti paskyros numeri
            System.out.print("\nIveskite paskyros numeri :");
            int paskyrosNumeris = klaviatura.nextInt();

            //ieskoti paskyros
            int index = ieskotiPaskyros(paskyros, count, paskyrosNumeris);
            if (index >= 0) {
                //must be instance of islaiduirasas(savings account)
                if (paskyros[index] instanceof IslaiduIrasas) {
                    ((IslaiduIrasas)paskyros[index]).applyInterest();
                } else {
                    System.out.print("Su tokiu paskyros numeriu paskyros nera: " + paskyrosNumeris);
                }
            }
        }

        public static Programa sukurtiPaskyra(Scanner klaviatura){
            Programa paskyra = null;
            int pasirinkimas = paskyrosMenu(klaviatura);

            int paskyrosNumeris;
            System.out.print("Iveskite paskyros Numeri : ");
            paskyrosNumeris = klaviatura.nextInt();

            if (pasirinkimas == 1) { //checking account
                System.out.print("Iveskite perlaidos mokesti : ");
                double mokestis = klaviatura.nextDouble();
                paskyra = new IslaiduIrasas(paskyrosNumeris, mokestis);
            } else { // Savings account
                System.out.print("Iveskite Interest rate: ");
                double ir = klaviatura.nextDouble();
                paskyra = new PajamuIrasas(paskyrosNumeris, ir);
            } return paskyra;
        }
    /*
    meniu kad isspausdintu pasirinkimus ir gautu is vartotojo pasirinkima
     */
    public static int menu(Scanner klaviatura) {
        System.out.println("Saskaitos menu");
        System.out.println("1. Susikurkite nauja paskyra");
        System.out.println("2. Ineskite pajamas");
        System.out.println("3. Isimkite pinigus");
        System.out.println("4. Apply Interest");
        System.out.println("5. Iseiti");

        int pasirinkimas;

        do {
            System.out.print("Iveskite pasirinkima : ");
            pasirinkimas = klaviatura.nextInt();
        } while (pasirinkimas < 1 || pasirinkimas > 5);
        return pasirinkimas;
    }
}
