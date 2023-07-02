import java.util.Scanner;

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

//WITHOUT DUPLICATES

public class zadatak7bezDuplikata {
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

        int pogodak = 0;
        boolean[] niz1Pogodjeni = new boolean[6];    //ovo mi je niz koji kontrolise da li je br iz prvog niza pogodjen u drugom nizu


        for (int i = 0; i < 6; i++) {                                   //prolazim kroz svaki broj u prvom nizu
            for (int j = 0; j < 30; j++) {                             //prolazim kroz svaki broj u drugom nizu
                if (niz1[i] == niz2[j] && !niz1Pogodjeni[i]) {         //ako je nadje pogodak koji je razlicit od prethodnih pogodjenih
                    pogodak++;                                        //ako je razlicit, tj. ako  imam novi pogodak, dodaje se poen
                    niz1Pogodjeni[i] = true;                         //dakle imam pogodak
                    break;                                          // izlazi i proverava se sledeci broj
                }
            }
        }

        int[] pogodjeni = new int[pogodak];
        int p = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1Pogodjeni[i]) {
                pogodjeni[p] = niz1[i];
                p++;
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
          bingo(unesiBrojeve(),randomBrojevi());
    }
}
