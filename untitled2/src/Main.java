import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void losowaTablica(int[] tablica){
        Random random = new Random();

        for(int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(100) + 1;
        }
    }

    public static int wyszukaj(int[] tablica, int szukanaliczba){
        int[] wartownik = new int[tablica.length + 1];

            wartownik[i] = tablica[i];
        }
        wartownik[tablica.length] = szukanaliczba;

        int i = 0;
        while(wartownik[i] != szukanaliczba){
            i++;
        }

        if(i == tablica.length){
            return -1;
        }
        return i;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[50];
        losowaTablica(tablica);

        System.out.print("Podaj liczbe do wyszukania (1-100): ");
        int szukanaliczba = scanner.nextInt();

        System.out.println("\nTablica:");

        for(int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i]);

            if(i < tablica.length - 1){
                System.out.print(", ");
            }
        }

        int wynik = wyszukaj(tablica, szukanaliczba);

        if(wynik == -1){
            System.out.println("\nNie znaleziono " + szukanaliczba + " w tablicy");
        }else{
            System.out.println("\nZnaleziono " + szukanaliczba);
            System.out.println("Indeks pierwszego wystapienia: " + wynik);
        }
        scanner.close();
    }
}