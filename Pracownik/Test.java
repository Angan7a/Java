public class Test {
    public static void main(String[] args) {
        Pracownik[] listaPrac = new Pracownik[3];
        listaPrac[0] = new Pracownik();
        listaPrac[1] = new Pracownik("Jan", "Kowalski", 15);
        listaPrac[2] = new Pracownik(listaPrac[1]);
        for(Pracownik prac: listaPrac)
            prac.wyswietl();
    }
}
