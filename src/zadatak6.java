public class zadatak6 {

    //    * 6) Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine),
//    porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci
//    niz, ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom, samo ispisati
//    preostale elemente.
    // * 6) Create a function that receives two sets of integers (they don't have to be the same size),
// compare each number at the same position and, depending on which one is bigger, add it to the result
// array, if one array runs out of elements to compare with another array, just print
// remaining elements.



    public static int[] najveci(int[] niz1, int[] niz2) {
        int duzinaNajveceg = Math.max(niz1.length, niz2.length);     //duzina novog niza, mora biti kao duzina duzeg

        int[] najveci = new int[duzinaNajveceg];

        for (int i = 0; i < duzinaNajveceg; i++) {                 //prolazim kroz svaki element niza
            if (i >= niz1.length) {                               //proveravam da li je i veci ili jednak od duzine prvog niza
                najveci[i] = niz2[i];                            //ako  jeste, uzimam clana iz niza 2 jer je on duzine mog niza
            } else if (i >= niz2.length) {
                najveci[i] = niz1[i];                           // ako nije, znaci da mi je niz 1 duzi (duzine mog niza), pa uzimam njegove preostale clanove
            } else {
                najveci[i] = Math.max(niz1[i], niz2[i]);       //sve dok mi se indeksi poklapaju, birace se veci od dva u nizu na istim indeksima
            }
        }

        return najveci;
    }
    public static void main(String[] args) {

        int[] niz1 = {6, 2, 9, -4, 16, 5};
        int[] niz2 = {6, 1, 7, 8, 9, 200, 33};
        int[] nizKonacni = najveci(niz1, niz2);

        for (int i = 0; i < nizKonacni.length; i++) {
            System.out.print(nizKonacni[i] + " ");

        }
    }
}
