public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    public Pracownik() {
        imie = "brak";
        nazwisko = "brak";
        wiek = 0;
    }

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik(Pracownik pracownik) {
        this.imie = pracownik.imie;
        this.nazwisko = pracownik.nazwisko;
        this.wiek = pracownik.wiek;
    }

    void wyswietl() {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(wiek);
    }
}
