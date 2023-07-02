import java.util.Random;
import java.util.Scanner;

public class zadatak7 {


//    7) Napraviti program koji:
//     a) Ima funkciju koja omogucava korisniku da unese u niz 6 brojeva(nebitno kojih).
//     public static int[] unesiBrojeve()
//
//     b) Funkciju koja generise nasumicnih 30 brojeva.(Ovde ce nam trebati Math.random()
//     funkcija koja generise Random broj, ali je problem sto generise jedan double broj sa dugom
//     decimalom, osmislite kako bi vi taj broj skratili i pretvorili ga u ceo broj)
//     public static int[] randomBrojevi()
//
//     c) Funkcija koja ispisuje korisniku koliko je brojeva pogodio i koje brojeve je pogodio.
//     public static void bingo(int[] niz1, int[] niz2)

    // 7) Create a program that:
// a) It has a function that allows the user to enter a series of 6 numbers (it doesn't matter which ones).
// public static int[] enterNumbers()
//
// b) A function that generates 30 random numbers. (Here we will need Math.random()
// a function that generates a Random number, but the problem is that it generates a long double number
// with a decimal, figure out how you would abbreviate that number and turn it into a whole number)
// public static int[] randomNumbers()
//
// c) A function that prints to the user how many numbers he guessed and which numbers he guessed.
// public static void bingo(int[] array1, int[] array2)

    public static int[] unesiBrojeve() {
        Scanner sc = new Scanner(System.in);
        int[] nizSestBrojeva = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Unesi broj");
            nizSestBrojeva[i] = sc.nextInt();
            if (nizSestBrojeva[i] < 1 || nizSestBrojeva[i] > 31) {
                System.out.println("Uneli ste broj koji nije izmedju 1 i 30.");
                i--;
                continue;
            }
        }
        return nizSestBrojeva;
    }

    public static int[] randomBrojevi() {
        Scanner sc = new Scanner(System.in);
        int[] nizRandomBrojeva = new int[30];
        for (int i = 0; i < nizRandomBrojeva.length; i++) {
            double broj = Math.random();
            int ceoBroj = (int) (broj * 30) + 1;
            nizRandomBrojeva[i] = ceoBroj;
        }
        System.out.println("Izvuceni su brojevi:");
        for (int i = 0; i < nizRandomBrojeva.length; i++) {
            System.out.print(nizRandomBrojeva[i] + " ");
        }
        return nizRandomBrojeva;
    }


    public static void bingo(int[] niz1, int[] niz2) {
//
        int pogodak = 0;

        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 30; j++) {
                if (niz1[i] == niz2[j]) {
                    pogodak++;
                }

            }
        }

        int[] pogodjeni = new int[pogodak];
        int p = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    pogodjeni[p] = niz2[j];
                    p++;
                }
            }
        }
        System.out.println();
        System.out.println("Ukupan broj pogodaka je: " + pogodak);
        System.out.println("Pogodjeni brojevi su: ");
        for (int i = 0; i < pogodjeni.length; i++) {
            System.out.print(pogodjeni[i] + ", ");
        }
        if (pogodjeni.length>=6){
            System.out.println();
            System.out.println("Osvojili ste bingo!");
        }

    }

    public static void main(String[] args) {

            bingo(unesiBrojeve(), randomBrojevi());

        }
    }
