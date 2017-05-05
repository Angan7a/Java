public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    void setImie(String imie){ 
        this.imie = imie;
    }
    void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    void setWiek(int wiek) {
        this.wiek = wiek;
    }
    String getImie() {
        return imie;
    }
    String getNazwisko() {
        return nazwisko;
    }
    int getWiek() {
        return wiek;
    }
}
