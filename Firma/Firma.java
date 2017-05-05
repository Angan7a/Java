import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        int ile = 0;
        String a;
        Scanner czytaj = new Scanner(System.in);

        System.out.print("Ilu pracownikow chcesz utorzyc: ");
        ile = czytaj.nextInt();

        Pracownik[] pracownicy = new Pracownik[ile];
        
        for(int i = 0; i < pracownicy.length; ++i) {
            pracownicy[i] = new Pracownik();

            System.out.print("Podaj imie " + (i+1) + " pracownika: ");
            a = czytaj.nextLine();
            a = czytaj.nextLine();
            pracownicy[i].setImie(a);

            System.out.print("Podaj nazwisko " + (i+1) + " pracownika: ");
            a = czytaj.nextLine();
            pracownicy[i].setNazwisko(a);
        
            System.out.print("Podaj wiek " + (i+1) + "pracownika: \n");
            pracownicy[i].setWiek(czytaj.nextInt());
        }
        for(int i = 0; i < pracownicy.length; ++i) {
            System.out.print("\nPracownik  " + (i+1) + ": \n");   
            System.out.print("Imie: " + pracownicy[i].getImie() + "\n");   
            System.out.print("Nazwisko: " + pracownicy[i].getNazwisko() + "\n");
            System.out.print("Wiek: " + pracownicy[i].getWiek() + "\n");
        }
    }
}
