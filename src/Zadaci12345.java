public class Zadaci12345 {


    //1) Napraviti funkciju koja kao argument prima niz Stringova, i String koji zelimo da lociramo
    //u tom nizu. Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.
    //1) Create a function that receives as an argument an array of Strings, and the String we want to locate
    //in that array. As a result, return true/false if it is/is not in the array.

    public static boolean find(String rec, String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (rec.equalsIgnoreCase(niz[i])) {
                return true;
            }
        }
        return false;
    }

    //2) Napraviti funkciju koja prima niz celih brojeva i kao rezultat vraca nov niz gde je svaki
    //element pomnozen sa Pi.
    //2) Create a function that receives an array of integers and as a result returns a new array where each one is
    //element multiplied by Pi.
    public static double[] pomnozenoSaPI(int[] brojevi) {

        double[] pomnozenoSaPI = new double[brojevi.length];
        final double PI = 3.14;
        for (int i = 0; i < brojevi.length; i++) {
            pomnozenoSaPI[i] = brojevi[i] * PI;
        }
        return pomnozenoSaPI;
    }

    //3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.
    //3) Create a function that will reverse the order of characters for the passed String.
    public static String reverse(String rec) {
        String reverse = "";                             //ovo koristim da tu ubacim obrnutu rec
        for (int i = rec.length() - 1; i >= 0; i--) {    //prolazim kroz rec od poslednjeg do prvog karaktera
            // stavljam length-1 jer tipa ana ima duzinu 3, al su indeksi 0,1,2, znaci idem od 2 do 0
            reverse += rec.charAt(i);                    //charAt koristim da bih pristupila karakteru u stringu, tipa charAt(0) za mama mi je m
        }
        return reverse;
    }

    //4) Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo, i String
    //sa kojim zelimo da ga zamenimo u tom nizu.
    //4) Create a function that will receive an array of Strings, the String we want to replace, and the String
    //which we want to replace it with in that array.
    public static void replaceWith(String[] niz, String oldString, String newString) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equalsIgnoreCase(oldString)) {
                niz[i] = newString;
            }
        }
    }

    //5) Napraviti funkciju koja prima String, String zapis ce biti u vidu nekog broja(npr "123",
    //"741",..), funkcija treba ovaj String da pretvori u ceo broj i da ispise svaki broj koji je deljiv
    //sa tim brojem.
    //5) Create a function that receives a String, the String record will be in the form of a number (eg "123",
    //"741",..), the function should convert this String to an integer and print every number that is divisible
    //with that number.
    public static void deljivSa(String broj) {
        int n = Integer.parseInt(broj);
        for (int i = 1; i <= n; i++) {     //idem od 1 jer ne mogu da delim sa 0
            if (n % i == 0) {              // gledam da li mi je broj deljiv sa bilo kojim brojem od 1 do n
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {

//
//
        String[] reci = {"Ja", "sam", "car"};
        String rec = "on";
        System.out.println(find(rec, reci));


        int[] a = {1, 1, 3, 1, 0, 100, -1};
        double[] p = pomnozenoSaPI(a);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i] + " ");
        }

        String andjela = "Ana voli Milovana";
        String stara = "car";

        String[] imena = {"Andjela", "Jovana", "Milica"};
        String staroIme = "Andjela";
        String novoIme = "Nikola";
        replaceWith(imena, staroIme, novoIme);
        for (int i = 0; i < imena.length; i++) {
            System.out.println(imena[i] + " ");
        }

        String b = "25";
        deljivSa(b);

    }
}






