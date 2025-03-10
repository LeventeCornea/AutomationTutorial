package teme;

import org.testng.annotations.Test;

public class Prezentare {
    public String text;
    public int varsta;
    public String nume;
    public String prenume;
    public String input;
    public char letter1;
    public char letter2;
    public String text2;
    public boolean rezultat1;
    public String text3;
    public String[] words;
    public boolean prenumeSalariatAndrei;
    public int salariulAngajatului;
    public boolean numeAngajatPopescu;
    public String IDAngajatPopescu;
    public String departamentAngajatPopescu;

    public void printWithMessage(String message) {
        System.out.println(message + " Poti pleca acasa dupa ce iti verific munca!");
    }

    @Test
    public void PrezentarePersoana() {
        text = "Hello World";
        varsta = 29;
        nume = "Cornea";
        prenume = "Levente";
        input = "Salut";
        letter1 = 'M';
        letter2 = 'H';
        text2 = "Salut";
        rezultat1 = true;
        text3 = "Ana are mere,pere,prune";
        words = text3.split("(?<=\\b|,)");
        StringBuilder result = new StringBuilder();
        prenumeSalariatAndrei = true;
        salariulAngajatului = 4000;
        numeAngajatPopescu = true;
        IDAngajatPopescu = "2205PQ";
        departamentAngajatPopescu = "Vanzari";

        if (rezultat1) {
            printWithMessage(text + letter2);
        }

        printWithMessage(String.valueOf(varsta));
        printWithMessage(nume);
        printWithMessage(prenume);

        for (String word : words) {
            if (word.matches(".*[aeiouAEIOU](,?)$")) {
                if (word.endsWith(",")) {
                    result.append(word.substring(0, word.length() - 1)).append("z,");
                } else {
                    result.append(word).append("z");
                }
            } else {
                result.append(word);
            }
        }
        printWithMessage(result.toString());

        if (prenumeSalariatAndrei) {
            printWithMessage("Salariul angajatului Andrei este: " + salariulAngajatului + " RON");
        }

        if (numeAngajatPopescu) {
            printWithMessage("ID de angajat si Departamentul din care face parte sunt: " + IDAngajatPopescu + " si " + departamentAngajatPopescu);
        }
        nrDepartament(290);
        numerelePentruEcuatie(2, 3, 4);
    }

    public void nrDepartament(int nr) {
        if (nr > 287) {
            printWithMessage("Numarul departamentului este: " + String.valueOf(nr));
        }
    }
    public void numerelePentruEcuatie(double nr1, double nr2, double nr3) {
        double rezultat = (nr1 + nr2 * nr3 - nr2) / nr2;
        System.out.println("Rezultatul corect este: " + rezultat);
    }
}