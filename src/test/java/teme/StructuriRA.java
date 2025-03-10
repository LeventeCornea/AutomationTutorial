package teme;

import org.testng.annotations.Test;

public class StructuriRA {

    @Test
    public void metodaTest() {
        //afisamDA();
        //afisamPrimeleTreiNumere();
        //afisamNumarulMaiMare();
        //afisamNumarulMaiMic();
        //afisamNumerelePareSiImpare();
        //afisamNumerelePare();
        //afisamPrimeleNumereDivizibileCuCinci();
        //afisamSumaADouaNumere();
        //afisamSumaNumerelorPanaLaZece();
        afisamProdusulNumerelorPanaLaCinci();
    }

    public void afisamDA() {
        String cuvant = "DA";
        int numerotare = 5;

        for (int index = 0; index < numerotare; index++) {
            System.out.print(cuvant + " ");
        }
    }

    public void afisamPrimeleTreiNumere() {
        int numar = 3;

        for (int index = 1; index <= numar; index++)
            System.out.println(index);
    }

    public void afisamNumarulMaiMare() {
        int nr1 = 15;
        int nr2 = 20;
        int max = Math.max(nr1, nr2);
        System.out.println("Numarul mai mare este: " + max);
    }

    public void afisamNumarulMaiMic() {
        double nr1 = 4.5;
        double nr2 = 3.25;
        double min = Math.min(nr1, nr2);
        System.out.println("Numarul mai mic este: " + min);
    }

    public void afisamNumerelePareSiImpare() {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("numarul " + index + " este par");
            } else {
                System.out.println("numarul " + index + " este impar");
            }
        }
    }

    public void afisamNumerelePare() {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("numarul " + index + " este par");
            }
        }
    }

    public void afisamPrimeleNumereDivizibileCuCinci() {
        for (int index = 1; index <= 15; index++) {
            if (index % 5 == 0) {
                System.out.println("Numarul " + index + " este divizibil cu 5");
            }
        }
    }

    public void afisamSumaADouaNumere() {
        int nr1 = 235;
        int nr2 = 10;
        int suma = nr1 + nr2;
        System.out.println("Suma celor doua numere este: " + suma);
    }

    public void afisamSumaNumerelorPanaLaZece() {
        int suma = 0;
        for (int index = 0; index <= 10; index++) {
            suma += index;
        }
        System.out.println("Suma numerelor de la 1 la 10 este: " + suma);
    }

    public void afisamProdusulNumerelorPanaLaCinci() {
        int produsul = 1;
        for (int index = 1; index <= 5; index++) {
            produsul *= index;
        }
        System.out.println("Produsul numerelor de la 1 la 5 este: " +produsul);
    }
}